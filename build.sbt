ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.15"

lazy val root = (project in file("."))
  .settings(
    name := "monitoring-client",
    idePackagePrefix := Some("monitoring.client"),
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1",
      "org.openjfx" % "javafx-controls" % "17.0.2",
      "org.openjfx" % "javafx-graphics" % "17.0.2",
      "org.openjfx" % "javafx-base" % "17.0.2"
    ),
    Compile / javacOptions ++= Seq(
      "--add-modules", "javafx.controls,javafx.graphics,javafx.base"
    ),
    run / javaOptions ++= Seq(
      "--add-modules", "javafx.controls,javafx.graphics,javafx.base"
    )
  )