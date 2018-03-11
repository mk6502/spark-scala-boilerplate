import org.apache.spark.sql.{Row, SparkSession}
import org.apache.spark.sql.types._

object SimpleApp {
  def main(args: Array[String]) {
    val spark = SparkSession.builder.appName("hello world").getOrCreate()

    val rows = Seq(
      Row(1, "hello"),
      Row(2, "world")
    )

    val schema = StructType(List(
      StructField("number", IntegerType, true),
      StructField("word", StringType, true)
    ))

    val df = spark.createDataFrame(
      spark.sparkContext.parallelize(rows),
      schema
    )

    println(df.count())

    spark.stop()
  }
}
