package temperature.client;

import com.proto.temp.Temperature;
import com.proto.temp.TempRequest;
import com.proto.temp.TempResponse;
import com.proto.temp.TempServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class TemperatureClient {
    public static void main(String[] args) {
        System.out.println("Temperature Client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        System.out.println("Stub is being created");
        //Create temperature service client
        TempServiceGrpc.TempServiceBlockingStub tClient = TempServiceGrpc.newBlockingStub(channel);

        //create protobuf temperature
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Desired Temperature: ");
        String myTemp = sc.next();

        Temperature temperature = Temperature.newBuilder()
                .setCurrentTemp(myTemp)
                .build();
        System.out.println("Setting to temperature...");

        //create protobuf for temp request
        TempRequest tempRequest = TempRequest.newBuilder()
                .setTemperature(temperature)
                .build();

        //RPC call to return a response
        TempResponse tempResponse = tClient.temp(tempRequest);
        System.out.println(tempResponse.getResult());

        System.out.println("Shutting down channel...");
        channel.shutdown();
    }
}
