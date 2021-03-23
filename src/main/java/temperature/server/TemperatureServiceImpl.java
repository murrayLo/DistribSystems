package temperature.server;

import com.proto.temp.TempRequest;
import com.proto.temp.TempResponse;
import com.proto.temp.TempServiceGrpc;
import com.proto.temp.Temperature;
import io.grpc.stub.StreamObserver;

public class TemperatureServiceImpl extends TempServiceGrpc.TempServiceImplBase {

    @Override
    public void temp(TempRequest request, StreamObserver<TempResponse> responseObserver) {
        //super.temp(request, responseObserver);

        //Get data for the response
        Temperature temperature = request.getTemperature();
        String currentTemp = temperature.getCurrentTemp();

        //create the response
        String result = "Current temp is" + currentTemp;
        TempResponse response = TempResponse.newBuilder().setResult(result).build();

        //send the response to the client
        responseObserver.onNext(response);

        //complete the RPC call
        responseObserver.onCompleted();
    }
}
