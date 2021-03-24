package radio.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class RadioServer {
    public static void main (String[] args) throws IOException, InterruptedException {
        System.out.println("Starting radio server...");

        Server server = ServerBuilder.forPort(50052)
                .addService(new RadioServiceImpl())
                .build();

        server.start();
        System.out.println("** Radio server is running **");

        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("\nRadio server shutting down...");
            server.shutdown();
            System.out.println("** Radio server shut down successfully **");
        } ));

        server.awaitTermination();
    }
}
