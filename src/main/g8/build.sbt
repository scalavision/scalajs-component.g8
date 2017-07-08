lazy val typeSafeCssRefJS = RootProject(file("../webStyleRef/shared"))

lazy val commonSettings = Seq(
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.12.2",
  libraryDependencies ++= testDependencies.value,
  scalacOptions ++= compileOptions.value
) ++ ScalaJSDefaultsPlugin.scalaJsDefaults

lazy val $projectName$Settings = Seq(
  name := "$projectName$",
  organization := "scalavision",
  libraryDependencies ++= Seq(
    "com.lihaoyi" %%% "sourcecode" % DefaultDependencies.MetaProgramming.sourceCodeVersion
  )  ++ scalaJSDefaultDeps.value
)

lazy val web$projectName;format="Camel"$ = Project(
    id = "web$projectName;format="Camel"$",
    base = file("web$projectName;format="Camel"$")
).enablePlugins(ScalaJSPlugin)
.settings(commonSettings :_*)
.settings($projectName$Settings :_*)
.dependsOn(typeSafeCssRefJS)

lazy val $projectName$ = project.in(file("."))
  .settings(scalaVersion := "2.12.2")
  .aggregate(typeSafeCssRefJS, web$projectName;format="Camel"$)
