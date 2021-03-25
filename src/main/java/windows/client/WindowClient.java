package windows.client;

import com.proto.windows.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class WindowClient {

    public static void main(String[] args) {
        System.out.println("Window Client");

        WindowClient main = new WindowClient();
        main.run();
    }

    private void run(){
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50053)
                .usePlaintext() //using plain text to avoid ssl during development
                .build();

        //doUnaryCall(channel);
        //doServerStreamingCall(channel);
        doClientStreamingCall(channel);

        //shut down the channel
        System.out.println("** Window Service Finished **");
        channel.shutdown();
    }

    private void doUnaryCall(ManagedChannel channel){
        //Create greet service client (blocking - synchronous)
        System.out.println("Stub is being created...");
        WindowServiceGrpc.WindowServiceBlockingStub winClient = WindowServiceGrpc.newBlockingStub(channel);

        //UNARY CLIENT
        //take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a room: ");
        String myWindowName = sc.next();
        System.out.println("Open or Close? ");
        String myWindowState = sc.next();

        //set that input as the window message
        SmartWindow smartWindow = SmartWindow.newBuilder()
                .setWindowName(myWindowName)
                .setState(myWindowState)
                .build();

        WindowRequest windowRequest = WindowRequest.newBuilder()
                .setSmartWindow(smartWindow)
                .build();

        //RPC call
        WindowResponse windowResponse = winClient.windowUn(windowRequest);
        System.out.println(windowResponse.getResult());

        //END OF UNARY CLIENT

    }

    private void doServerStreamingCall(ManagedChannel channel){
        //Create greet service client (blocking - synchronous)
        System.out.println("Stub is being created...");
        WindowServiceGrpc.WindowServiceBlockingStub winClient = WindowServiceGrpc.newBlockingStub(channel);

        //SERVER STREAMING CLIENT
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want windows open or closed? ");
        String myWindowState = sc.next();

        WindowSvrRequest windowSvrRequest = WindowSvrRequest.newBuilder()
                .setSmartWindow(SmartWindow.newBuilder().setState(myWindowState))
                .build();

        winClient.windowSvrStream(windowSvrRequest)
                .forEachRemaining(windowSvrResponse -> {
                    System.out.println(windowSvrResponse.getResult());
                });
        //END OF SERVER STREAMING CLIENT
    }

    private void doClientStreamingCall(ManagedChannel channel) {
        //create asynchronous stub for the window service (not blocking stub)
        WindowServiceGrpc.WindowServiceStub asyncClient = WindowServiceGrpc.newStub(channel);

        CountDownLatch cdLatch = new CountDownLatch(1); //used by the response observer

        StreamObserver<WindowClRequest> requestObserver = asyncClient.windowClStream(new StreamObserver<WindowClResponse>() {
            @Override
            public void onNext(WindowClResponse value) {
                //get response from server
                System.out.println("Confirmed... ");
                System.out.println(value.getResult());
            }

            @Override
            public void onError(Throwable t) {
                //get error from server

            }

            @Override
            public void onCompleted() {
                //server done
                System.out.println("** Server finished **");
                cdLatch.countDown();
            }
        });

        //take input from user
            Scanner sc = new Scanner(System.in);

            //room 1
            System.out.println("Enter a Room: ");
            String myWindowName = sc.next();
            System.out.println("Would you like windows in this room open or closed: ");
            String myWindowState = sc.next();

            //use input for request

            requestObserver.onNext(WindowClRequest.newBuilder()
                    .setSmartWindow(SmartWindow.newBuilder()
                            .setWindowName(myWindowName)
                            .setState(myWindowState)
                            .build())
                    .build());

            //room 2
            System.out.println("Enter a Room: ");
            String myWindowName2 = sc.next();
            System.out.println("Would you like windows in this room open or closed: ");
            String myWindowState2 = sc.next();

            //use input for request
            requestObserver.onNext(WindowClRequest.newBuilder()
                    .setSmartWindow(SmartWindow.newBuilder()
                            .setWindowName(myWindowName2)
                            .setState(myWindowState2)
                            .build())
                    .build());

            //room 3
            System.out.println("Enter a Room: ");
            String myWindowName3 = sc.next();
            System.out.println("Would you like windows in this room open or closed: ");
            String myWindowState3 = sc.next();

            //use input for request
            requestObserver.onNext(WindowClRequest.newBuilder()
                    .setSmartWindow(SmartWindow.newBuilder()
                            .setWindowName(myWindowName3)
                            .setState(myWindowState3)
                            .build())
                    .build());

        //notify server that client is finished sending data
        requestObserver.onCompleted();

        try {
            cdLatch.await(10L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
