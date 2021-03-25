package windows.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class WindowServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting window server...");

        Server server = ServerBuilder.forPort(50053)
                .addService(new WindowServiceImpl())
                .build();

        server.start();
        System.out.println("** Window server is running **");

        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("\nShutting down the server...");
            server.shutdown();
            System.out.println("** Window server shut down successfully **");
        }));

        server.awaitTermination();
    }
}
