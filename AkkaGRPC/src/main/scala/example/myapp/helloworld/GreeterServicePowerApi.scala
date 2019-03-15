package example.myapp.helloworld

import akka.NotUsed
import akka.grpc.scaladsl.Metadata
import akka.stream.scaladsl.Source
import example.myapp.helloworld.grpc.{HelloReply, HelloRequest}

import scala.concurrent.Future

trait GreeterServicePowerApi {
  def sayHello(in: HelloRequest, metadata: Metadata): Future[HelloReply]
  def itKeepsTalking(in: Source[HelloRequest, NotUsed], metadata: Metadata): Future[HelloReply]
  def itKeepsReplying(in: HelloRequest, metadata: Metadata): Source[HelloReply, NotUsed]
  def streamHellos(in: Source[HelloRequest, NotUsed], metadata: Metadata): Source[HelloReply, NotUsed]
}
