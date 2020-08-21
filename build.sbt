name := "ProjectTest1"

version := "0.1"

scalaVersion := "2.13.3"
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
val AkkaVersion = "2.6.8"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
