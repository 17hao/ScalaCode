import Dependencies._

scalaVersion := "2.12.8"

lazy val scalacode = (project in file("."))
  .settings(
    libraryDependencies ++= dependencies
  )

scalaSource in Compile := baseDirectory.value / "src"
scalaSource in Test := baseDirectory.value / "src/test"
resourceDirectory in Compile := file("protobuf")
