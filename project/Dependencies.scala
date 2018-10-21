import sbt.Keys._
import sbt._

object Dependencies {

  val akkaVersion = "2.5.14"
  val akkaHttpVersion = "10.0.10"
  val sprayVersion = "1.3.2"
  val scalazVersion = "7.2.26"
  val cytoscapeVersion = "2.7.9"

  val akkaActor                = "com.typesafe.akka"               %% "akka-actor"                          % akkaVersion
  val akkaPersistence          = "com.typesafe.akka"               %% "akka-persistence"                    % akkaVersion
  val akkaTestkit              = "com.typesafe.akka"               %% "akka-testkit"                        % akkaVersion
  val akkaSlf4j                = "com.typesafe.akka"               %% "akka-slf4j"                          % akkaVersion
  val akkaStream               = "com.typesafe.akka"               %% "akka-stream"                         % akkaVersion
  val akkaQuery                = "com.typesafe.akka"               %% "akka-persistence-query"              % akkaVersion
  val akkaHttp                 = "com.typesafe.akka"               %% "akka-http-experimental"              % akkaHttpVersion
  val akkaInmemoryJournal      = "com.github.dnvriend"             %% "akka-persistence-inmemory"           % "1.3.14"

  val akkaAnalyticsCassandra   = "com.github.krasserm"             %% "akka-analytics-cassandra"   % "0.3.1"
  val akkaAnalyticsKafka       = "com.github.krasserm"             %% "akka-analytics-kafka"       % "0.3.1"

  val scalazCore               = "org.scalaz"                      %% "scalaz-core"               % scalazVersion

  val akkaPersistenceCassandra = "com.typesafe.akka"               %% "akka-persistence-cassandra" % "0.18"
  val akkaPersistenceQuery     = "com.typesafe.akka"               %% "akka-persistence-query-experimental" % akkaVersion

  val scalaGraph               = "com.assembla.scala-incubator"    %% "graph-core"             % "1.10.1"
  val scalaGraphDot            = "com.assembla.scala-incubator"    %% "graph-dot"              % "1.10.1"

  val fs2Core                  = "co.fs2"                          %% "fs2-core"               % "1.0.0"
  val catsCore                 = "org.typelevel"                   %% "cats-core"              % "1.4.0"

  val logback                  = "ch.qos.logback"                  %  "logback-classic"        % "1.1.2"
  val ficus                    = "net.ceedubs"                     %% "ficus"                  % "1.1.2"
  val scalaReflect             = "org.scala-lang"                  % "scala-reflect"           % "2.11.8"
  val scalatest                = "org.scalatest"                   %% "scalatest"              % "3.0.5"
}
