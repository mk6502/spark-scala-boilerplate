# Scala Spark 2.3.0 Example Project #
This contains enough boilerplate code to get you started with Apache Spark 2.x and Scala.

Make sure to change the version of Spark libraries in `build.sbt`. This project should work for any version of
Apache Spark 2.0.0 or greater.

If you need to use Spark 1.6.x, this project will not work for you. See this instead: https://github.com/mikestaszel/spark-1.6-scala-boilerplate

## Building ##
Run the following:

    sbt assembly

Your JAR file to use with `spark-submit` will be: `target/scala-2.11/hellospark-assembly-1.0.jar`.

## Using in IntelliJ ##
To use this project in IntelliJ, import the project from existing sources using `sbt`. Ensure that the Scala plugin is
installed first. IntelliJ will download `sbt` for you. This code has been tested with JDK 8.
