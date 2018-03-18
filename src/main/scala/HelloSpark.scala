import org.apache.spark.sql.{Row, SparkSession}
import org.apache.spark.sql.types._

object HelloSpark {
  def main(args: Array[String]) {
    val spark = SparkSession.builder.appName("hello spark").getOrCreate()

    val rows = Seq(
      Row(1, "hello"),
      Row(2, "world")
    )

    val schema = StructType(List(
      StructField("number", IntegerType, nullable = true),
      StructField("word", StringType, nullable = true)
    ))

    val df = spark.createDataFrame(
      spark.sparkContext.parallelize(rows),
      schema
    )

    println("count: ")
    println(df.count())

    spark.stop()
  }
}
