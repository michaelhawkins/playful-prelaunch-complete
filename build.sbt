name := "playful-prelaunch"

version := "1.0.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.10.4"

val playVersion = "2.3.0"
val slickVersion = "2.0.2"

resolvers += Classpaths.sbtPluginReleases

libraryDependencies ++= {
  Seq(
  	jdbc,
    anorm,
    "com.typesafe.play" %% "play" % playVersion,
  	"com.typesafe.play" %% "play-slick" % "0.6.0.1",
    "org.postgresql" % "postgresql" % "9.3-1101-jdbc41",
    "org.seleniumhq.selenium" % "selenium-java" % "2.42.2",
    "org.scala-lang" % "scala-swing" % "2.10.4",
    "org.scala-lang" % "scala-reflect" % "2.10.4",
    "org.scala-lang.modules" %% "scala-async" % "0.9.1",
    "org.webjars" %% "webjars-play" % playVersion,
    "org.webjars" % "bootstrap" % "3.1.1-1"
  )
}

scalacOptions ++= Seq(
    "-feature",
    "-language:postfixOps"  //This allows the postfix operator * to be enabled
)
