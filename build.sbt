name := "ProjectTest1"

version := "0.1"

scalaVersion := "2.13.3"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
val AkkaVersion = "2.6.8"
val AkkaHttpVersion = "10.2.0"


libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.8" % Test,
  "com.typesafe.akka" %% "akka-testkit" % AkkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion
)
libraryDependencies += "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.5.31" % Test