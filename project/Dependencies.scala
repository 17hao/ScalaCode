import sbt._

object Dependencies {
  // Libraries
  val rediscala = "com.github.etaty" %% "rediscala" % "1.8.0"
  val gson = "com.google.code.gson" % "gson" % "2.6.2"
  val kafka = "org.apache.kafka" % "kafka-clients" % "1.0.1"
  val test = "org.scalatest" %% "scalatest" % "3.0.5"
  val guice = "com.google.inject" % "guice" % "4.2.2"
  val akka: Seq[ModuleID] = Seq {
    "com.typesafe.akka" %% "akka-actor" % "2.5.26"
    "com.typesafe.akka" %% "akka-stream" % "2.5.26"
  }
  val grpc: Seq[ModuleID] = Seq {
    "io.grpc" % "grpc-protobuf" % "1.23.0"
    "io.grpc" % "grpc-stub" % "1.23.0"
    "io.grpc" % "grpc-netty-shaded" % "1.23.0"
  }

  // Projects
  val dependencies: Seq[ModuleID] =
    Seq(
      rediscala, gson, kafka, test, guice
    ) ++ akka ++ grpc
}