package radio.client;

import com.proto.radio.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class RadioClient {
    public static void main(String[] args) {
        System.out.println("Radio Client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        System.out.println("Stub is being created...");

        //create radio service client
        RadioServiceGrpc.RadioServiceBlockingStub radioClient = RadioServiceGrpc.newBlockingStub(channel);

//        //UNARY
//        //take input from user to set the station (protobuf SmartRadio message)
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What station do you want to listen to: ");
//        String myStation = sc.next();
//        SmartRadio smartRadio = SmartRadio.newBuilder()
//                .setStation(myStation)
//                .build();
//
//        //Take that string as the value for the request
//        RadioRequest radioRequest = RadioRequest.newBuilder()
//                .setSmartRadio(smartRadio)
//                .build();
//
//        //call the RPC to get the response (protobuf RadioResponse message)
//        RadioResponse radioResponse = radioClient.radio(radioRequest);
//        System.out.println(radioResponse.getResult());

        //SERVER STREAMING
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to listen to: ");
        String myStation = sc.next();

        //take the user input and set the request
        RadioStreamRequest radioStreamRequest =
                RadioStreamRequest.newBuilder()
                .setSmartRadio(SmartRadio.newBuilder().setStation(myStation))
                .build();

        //Stream the response (stream represents song or podcast etc.)
        radioClient.radioStream(radioStreamRequest)
                .forEachRemaining(radioStreamResponse -> {
                    System.out.println(radioStreamResponse.getResult());
                });

        //shut down the channel
        System.out.println("Finished playing " + myStation);
        channel.shutdown();
    }
}
