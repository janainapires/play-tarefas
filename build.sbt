name := "tarefas"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.4"

lazy val myProject = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

libraryDependencies ++= Seq(
  javaJdbc,
  guice,
  "com.google.guava" % "guava" % "14.0",
  "org.postgresql" % "postgresql" % "9.3-1102-jdbc4",
  "org.json" % "json" % "20180130"
)


