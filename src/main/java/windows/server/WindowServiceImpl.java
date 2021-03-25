package windows.server;

import com.proto.windows.*;
import io.grpc.stub.StreamObserver;

import java.awt.*;

public class WindowServiceImpl extends WindowServiceGrpc.WindowServiceImplBase {

    //CLIENT STREAMING
    @Override
    public StreamObserver<WindowClRequest> windowClStream(StreamObserver<WindowClResponse> responseObserver) {

        //create stream observer
        StreamObserver<WindowClRequest> requestObserver = new StreamObserver<WindowClRequest>() {

            String result = "";

            @Override
            public void onNext(WindowClRequest value) { //message from client
                result += value.getSmartWindow().getWindowName() + " window is now " + value.getSmartWindow().getState() + ", ";
            }

            @Override
            public void onError(Throwable t) { //error from client

            }

            @Override
            public void onCompleted() { //client done
                responseObserver.onNext(
                        WindowClResponse.newBuilder()
                        .setResult(result)
                        .build()
                );
                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }
}

