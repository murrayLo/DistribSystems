package temperature.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class TemperatureServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Temperature Server is Running");

        Server server = ServerBuilder.forPort(50051)

                //add the temperature service implementation to the server
                .addService(new TemperatureServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("Server shutting down...");
            server.shutdown();
            System.out.println("Server shut down successfully");
        } ) );

        server.awaitTermination();
    }
}
