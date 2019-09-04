import sbt._

object Dependencies {
  // Libraries
  val rediscala = "com.github.etaty" %% "rediscala" % "1.8.0"
  val gson = "com.google.code.gson" % "gson" % "2.6.2"
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % "2.5.23"
  val kafka = "org.apache.kafka" % "kafka-clients" % "1.0.1"
  val protobuf = "io.grpc" % "grpc-protobuf" % "1.23.0"
  val grpcStub = "io.grpc" % "grpc-stub" % "1.23.0"
  val grpcNetty = "io.grpc" % "grpc-netty-shaded" % "1.23.0"
  val test = "org.scalatest" %% "scalatest" % "3.0.5"

  // Projects
  val dependencies: Seq[ModuleID] =
    Seq(
      rediscala, gson, akkaActor, kafka, protobuf, grpcStub, grpcNetty, test
    )
}