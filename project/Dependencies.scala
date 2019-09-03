import sbt._

object Dependencies {
  // Libraries
  val rediscala = "com.github.etaty" %% "rediscala" % "1.8.0"
  val gson = "com.google.code.gson" % "gson" % "2.6.2"
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % "2.5.23"
  val kafka = "org.apache.kafka" % "kafka-clients" % "1.0.1"
  val protobuf = "com.google.protobuf" % "protobuf-java" % "3.8.0"

  // Projects
  val dependencies: Seq[ModuleID] = Seq(rediscala, gson, akkaActor, kafka, protobuf)
}