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

        //SERVER STREAMING
        //get user input
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
