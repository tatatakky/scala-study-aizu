val defaultSetting = Seq(
  organization := "com.github.tatatakky",
  scalaVersion := "2.12.8"
)

lazy val scalaTest = "3.0.7"
lazy val root = (project in file("."))
  .settings(
    name := "scala-study-aizu",
    defaultSetting,
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % scalaTest % "test"
      )
  )