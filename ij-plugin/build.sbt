name := "ij-minimal-plugin"
organization := "com.example"
version := "2025.1.20.1"
scalaVersion := "2.13.16"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-effect" % "3.4.4",
  "org.typelevel" %% "mouse" % "1.2.3",
  "com.github.pathikrit" %% "better-files" % "3.9.2"
)

Compile / unmanagedResourceDirectories ++= Seq(
  baseDirectory.value / "resources"
)

ThisBuild / intellijPluginName := s"scala-minimal"
ThisBuild / intellijBuild := "251.23774.318"
ThisBuild / intellijPlatform := intellijPlatform.in(Global).??(IntelliJPlatform.IdeaCommunity).value
intellijPlugins += "org.intellij.scala:2025.1.20".toPlugin
ThisBuild / bundleScalaLibrary := false

lazy val scalaIntellij = project.in(file("."))
  .enablePlugins(SbtIdeaPlugin)
