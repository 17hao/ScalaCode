name := "hello-slick"

version := "0.1"

scalaVersion := "2.12.8"

mainClass in Compile := Some("HelloSlick")

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.2.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.h2database" % "h2" % "1.4.187",
)
//resolvers += "https://search.maven.org"