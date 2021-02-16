name := "et001"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies ++= Seq (
  "com.badlogicgames.gdx" % "gdx-backend-lwjgl" % "1.9.14",
  "com.badlogicgames.gdx" % "gdx-platform" % "1.9.14" classifier "natives-desktop",
)
