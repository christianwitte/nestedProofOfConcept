lazy val subProject = RootProject(file("generator"))

lazy val root = (project in file(".")).settings(
  name := "nestedProofOfConcept",
  scalaVersion := "2.11.6"
).dependsOn(subProject)

lazy val myCommand = taskKey[Unit]("My Description")

myCommand := {
  //whatever you want to do — can call classes in subProject
  Generator.generate
}
