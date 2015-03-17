# nestedProofOfConcept
Proof of concept for nested Scala projects with SBT

"generator" is a nested project with a single object (Generator -- that has a single method: generate) that can be called from a custom SBT task key. (myCommand) code added to ./generator/src/main/scala/Generator.scala in the generate method will be executed when "myCommand" is called from the sbt prompt.
