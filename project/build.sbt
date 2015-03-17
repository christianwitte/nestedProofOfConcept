lazy val generator = RootProject(file("../generator"))

lazy val plugins = project in file(".") dependsOn generator
