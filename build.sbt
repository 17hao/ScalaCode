import Dependencies._

scalaVersion := "2.12.8"

lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= dependencies
  )

scalaSource in Compile := file("src")
resourceDirectory in Compile := file("src/protobuf")
