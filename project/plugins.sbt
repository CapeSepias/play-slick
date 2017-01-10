resolvers ++= DefaultOptions.resolvers(snapshot = true)

addSbtPlugin("com.typesafe.play" % "play-docs-sbt-plugin" % sys.props.getOrElse("play.version", "2.5.0"))
addSbtPlugin("com.typesafe.play" % "interplay" % sys.props.get("interplay.version").getOrElse("1.1.2"))
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.7")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.5")
