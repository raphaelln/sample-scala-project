lazy val `simple-project` = project in file(".")
organization := "com.raphaelln.sample"
name := "simple-project"

scalaVersion := "2.10.6"

libraryDependencies ++= Seq(  
  "org.slf4j"           % "slf4j-api"               % "1.7.21",
  "org.slf4j"           % "slf4j-simple"            % "1.7.7"  
)

// Test deps
libraryDependencies ++= Seq(
  "org.scalatest"   %% "scalatest"               % "2.2.6" % "test" 
)