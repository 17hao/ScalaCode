import Dependencies._

scalaVersion := "2.12.8"

lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= deps
  )