import Dependencies._

scalaVersion := "2.12.8"

lazy val scalacode = (project in file("."))
  .settings(
    libraryDependencies ++= dependencies
  )

scalaSource in Compile := file("src")
resourceDirectory in Compile := file("protobuf")
