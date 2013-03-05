import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "geoportal-module-$application_name$"
    val appVersion      = "1.0-SNAPSHOT"
	val appOrganization    = "$organization_name$"

    val appDependencies = Seq(
      // Add your project dependencies here,
		javaCore,
		javaJdbc,
		javaEbean,
		"com.gradoservice" %% "geoportal" % "3.1-SNAPSHOT"	  
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here     
	    organization := appOrganization,
		resolvers += Resolver.url("Objectify Play Repository", url("http://schaloner.github.com/releases/"))(Resolver.ivyStylePatterns),
		resolvers += Resolver.url("Objectify Play Snapshot Repository", url("http://schaloner.github.com/snapshots/"))(Resolver.ivyStylePatterns),
		resolvers += Resolver.url("Violas Play Modules", url("http://www.joergviola.de/releases/"))(Resolver.ivyStylePatterns),
		resolvers += "Open Source Geospatial Foundation Repository" at "http://download.osgeo.org/webdav/geotools/",
		resolvers += "Gradoservice Maven repository" at "http://git.prochar.ru/maven/",
		resolvers += "Apache Maven repository" at " http://repo1.maven.org/maven2/
    )

}