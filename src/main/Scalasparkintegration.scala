// // import org.apache.spark.sql.{SparkSession, DataFrame, Row}
// // import org.apache.spark.sql.types._

// //         val spark = SparkSession.builder().master("local").appName("DataFrameFromList").getOrCreate()
// //         val listOfInputs = List("studentName", "studentID", "studentAge", "studentGraduationStatus")
// //         val schema = StructType(Seq(
// //         StructField("studentName", StringType, nullable = false),
// //         StructField("studentID", IntegerType, nullable = false),
// //         StructField("studentAge", IntegerType, nullable = false),
// //         StructField("studentGraduationStatus", BooleanType, nullable = false)


// // ))




// import scala.io.StdIn._

// def readInputs(): (String, Int, Double) = {
//   // Read a line of input with multiple values
  
  

//   // Trim any leading/trailing spaces and split the input by commas
  

//   // Extract and convert the values
//   val strValue: String = values(0)         // First value as String
//   val intValue: Int = values(1).toInt       // Second value as Int
//   val doubleValue: Double = values(2).toDouble // Third value as Double

//   // Return the tuple
//   (strValue, intValue, doubleValue)
// }

// // Example usage
// val inputs = readInputs()
// println(s"Received inputs: String - ${inputs._1}, Int - ${inputs._2}, Double - ${inputs._3}")
