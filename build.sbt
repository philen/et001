name := "et001"

version := "0.1"

scalaVersion := "2.13.8"

libraryDependencies ++= Seq (
  "com.badlogicgames.gdx" % "gdx-backend-lwjgl" % "1.10.0",
  "com.badlogicgames.gdx" % "gdx-platform" % "1.10.0" classifier "natives-desktop",
)
