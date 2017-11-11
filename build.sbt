name := "eventsim"

version := "2.0"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "org.apache.avro" % "avro" % "1.7.7",
  "org.apache.commons" % "commons-math3" % "3.6",
  "de.jollyday" % "jollyday" % "0.5.1",
  "org.rogach" %% "scallop" % "3.1.1",
  "com.fasterxml.jackson.core" % "jackson-core" % "2.7.0",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.7.0",
  "org.apache.kafka" % "kafka-clients" % "0.9.0.0",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"
)

// libraryDependencies += "io.confluent" % "kafka-avro-serializer" % "2.0.0"
