package temperature.client;

import com.proto.temp.Temperature;
import com.proto.temp.TempRequest;
import com.proto.temp.TempResponse;
import com.proto.temp.TempServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class TemperatureClient {
    public static void main(String[] args) {
        System.out.println("Temperature Client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).build();

        System.out.println("Stub is being created");
        //Create temperature service client
        TempServiceGrpc.TempServiceBlockingStub tClient = TempServiceGrpc.newBlockingStub(channel);
        System.out.println("test ok to here 1");

        //create protobuf temperature
        Temperature temperature = Temperature.newBuilder()
                .setCurrentTemp("20")
                .build();
        System.out.println("Test temp: " + temperature);

        //create protobuf for temp request
        TempRequest tempRequest = TempRequest.newBuilder()
                .setTemperature(temperature)
                .build();
        System.out.println("test ok to here 3");

        //RPC call to return a response
        TempResponse tempResponse = tClient.temp(tempRequest);
        System.out.println("Current temperature is " + tempResponse.getResult());

        System.out.println("Shutting down channel...");
        channel.shutdown();
    }
}
