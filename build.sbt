name := """play-getting-started"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "org.jscience" % "jscience" % "4.3.1"
)

libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _ )
