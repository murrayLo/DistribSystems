package radio.server;

import com.proto.radio.*;
import io.grpc.stub.StreamObserver;

public class RadioServiceImpl extends RadioServiceGrpc.RadioServiceImplBase {

    @Override
    public void radio(RadioRequest request, StreamObserver<RadioResponse> responseObserver) {
        SmartRadio smartRadio = request.getSmartRadio();
        String station = smartRadio.getStation();

        //create response
        String result = "Listening to " + station;
        RadioResponse response = RadioResponse.newBuilder()
                .setResult(result)
                .build();

        //send response
        responseObserver.onNext(response);

        //complete rpc call
        responseObserver.onCompleted();
    }

    @Override
    public void radioStream(RadioStreamRequest request, StreamObserver<RadioStreamResponse> responseObserver) {
        String station = request.getSmartRadio().getStation();

        // try/catch for interrupted exception
        try {
            for (int i = 0; i < 10; i++) {
                String result = "Streaming " + station + " - " + i;
                RadioStreamResponse response = RadioStreamResponse.newBuilder()
                        .setResult(result)
                        .build();

                responseObserver.onNext(response);
                Thread.sleep(1000L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace(); //If thread gets interrupted print stack trace and send on completed.
        } finally {
            responseObserver.onCompleted();
        }
    }
}