name := "crawler"

version := "0.5.1"

scalaVersion := "2.8.1"

crossScalaVersions := Seq("2.8.1", "2.9.1")

libraryDependencies ++= Seq (
    "net.sourceforge.htmlunit" % "htmlunit" % "2.9"
)                                          

libraryDependencies <+=  scalaVersion  {
  case "2.8.1" => "org.scala-tools.testing" %% "specs" % "1.6.6" % "test"
  case "2.9.1" => "org.scala-tools.testing" %% "specs" % "1.6.9" % "test"
}

