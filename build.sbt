name := "et001"

version := "0.2"

scalaVersion := "2.13.8"

libraryDependencies ++= Seq (
  "com.badlogicgames.gdx" % "gdx-backend-lwjgl" % "1.11.0",
  "com.badlogicgames.gdx" % "gdx-platform" % "1.11.0" classifier "natives-desktop",
  "com.badlogicgames.gdx" % "gdx-lwjgl3-glfw-awt-macos" % "1.11.0"
)