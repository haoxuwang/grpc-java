package wang.haoxu;


import io.grpc.stub.StreamObserver;

/**
 * @Description MyServiceImpl
 * @Date 2022/1/20 4:56 下午
 * @Author william.wang
 */
public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder()
                .setMessage("Hello ==> " + request.getName())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
