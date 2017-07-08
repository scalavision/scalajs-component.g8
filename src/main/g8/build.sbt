lazy val typeSafeCssRefJS = RootProject(file("../webStyleRef/shared"))

lazy val commonSettings = Seq(
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.12.2",
  libraryDependencies ++= testDependencies.value,
  scalacOptions ++= compileOptions.value
) ++ ScalaJSDefaultsPlugin.scalaJsDefaults

lazy val $projectName;format="camel"$Settings = Seq(
  name := "$projectName$",
  organization := "scalavision",
  libraryDependencies ++= Seq(
    "com.lihaoyi" %%% "sourcecode" % DefaultDependencies.MetaProgramming.sourceCodeVersion
  )  ++ scalaJSDefaultDeps.value
)

lazy val web$projectName;format="Camel"$ = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(commonSettings :_*)
  .settings($projectName;format="camel"$Settings :_*)
  .dependsOn(typeSafeCssRefJS)
