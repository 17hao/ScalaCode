name := "AkkaGRPC"

version := "0.1"

scalaVersion := "2.12.8"

enablePlugins(AkkaGrpcPlugin)
// ALPN agent
enablePlugins(JavaAgent)
javaAgents += "org.mortbay.jetty.alpn" % "jetty-alpn-agent" % "2.0.9" % "runtime;test"
