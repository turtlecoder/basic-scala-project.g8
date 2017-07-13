name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "com.github.scopt" %% "scopt" % "3.6.0", // command line parsing
  "com.lihaoyi" % "ammonite" % "1.0.0" cross CrossVersion.full,
  "org.scalaz" %% "scalaz-core" % "7.2.14",
  "org.scalaz" %% "scalaz-effect" % "7.2.14",
  "org.scalaz" %% "scalaz-concurrent" % "7.2.14",
  "ch.qos.logback" % "logback-classic" % "1.2.2", // logging
  "org.specs2" %% "specs2-core" % "3.8.9" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")

scalacOptions ++= Seq(
  "-Yrangepos",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-Ywarn-dead-code",
  "-Xlint",
  "-Xfatal-warnings")

scalacOptions in Test ++= Seq(
  "-Yrangepos",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-Ywarn-dead-code",
  "-Xlint",
  "-Xfatal-warnings")

// Read here for optional dependencies:
// https://etorreborre.github.io/specs2/guide/SPECS2-3.8.3/org.specs2.guide.Installation.html#other-dependencies

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

initialCommands := "import $organization$._"
