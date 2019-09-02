import sbt._

object Dependencies {
  // Libraries
  val rediscala = "com.github.etaty" %% "rediscala" % "1.8.0"
  val gson = "com.google.code.gson" % "gson" % "2.6.2"
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % "2.5.23"

  // Projects
  val dependencies = Seq(rediscala, gson, akkaActor)
}