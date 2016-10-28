import sbt._

object Version {
  final val akka                = "2.4.8"
  final val play                = "2.5.9"
  final val scala               = "2.11.8"
  final val scalaTest           = "3.0.0"
  final val uPickle             = "0.4.1"
  final val jsonSchemaValidator = "2.2.6"
  final val ammoniteOps         = "0.7.7"
  final val moultingYaml        = "0.3.0"
}

object Lib {
  val akkaHttp            = "com.typesafe.akka" %% "akka-http-experimental" % Version.akka
  val playJson            = "com.typesafe.play" %% "play-json"              % Version.play
  val scalaTest           = "org.scalatest"     %% "scalatest"              % Version.scalaTest
  val upickle             = "com.lihaoyi"       %% "upickle"                % Version.uPickle
  val jsonSchemaValidator = "com.github.fge"     % "json-schema-validator"  % Version.jsonSchemaValidator
  val ammoniteOps         = "com.lihaoyi"       %% "ammonite-ops"           % Version.ammoniteOps
  val moultingYaml        = "net.jcazevedo"     %% "moultingyaml"           % Version.moultingYaml
}