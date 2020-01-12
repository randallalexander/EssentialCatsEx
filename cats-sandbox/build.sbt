name := "cats-sandbox"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.10"

scalacOptions ++= Seq(
  "-encoding", "UTF-8",   // source files are in UTF-8
  "-deprecation",         // warn about use of deprecated APIs
  "-unchecked",           // warn about unchecked type parameters
  "-feature",             // warn about misused language features
  "-language:higherKinds",// allow higher kinded types without `import scala.language.higherKinds`
  "-Xlint",               // enable handy linter warnings
  "-Xfatal-warnings",     // turn compiler warnings into errors
  "-Ypartial-unification" // allow the compiler to unify type constructors of different arities
)

libraryDependencies += "org.typelevel" %% "cats-core" % "1.4.0"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")
scalacOptions in (Compile, console) ~= {
  _.filterNot(Set("-Ywarn-unused-import", "-Xfatal-warnings", "-Xlint"))
}
scalacOptions in (Test, console) ~= {
  _.filterNot(Set("-Ywarn-unused-import", "-Xfatal-warnings", "-Xlint"))
}

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.3")
