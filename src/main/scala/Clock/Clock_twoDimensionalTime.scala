import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
object twoDimensionalTime{
    val Stars:twoDimensionalString = 
        twoDimensionalString(
        top    =  "    ",
        middle =  "  * ",
        bottom =  "  * "
        )
    def showCurrent(pattern:String):Unit = {
            show(LocalDateTime.now,pattern)
    }
    private def show(time:LocalDateTime,pattern:String):Unit={
    formatted(time,pattern).show()
    }
    private def formatted(time:LocalDateTime,pattern:String): twoDimensionalString = {
        oneDimensional(time,pattern).foldLeft(twoDimensionalString.Empty) { (result,timeDigit) =>
            if(timeDigit == ':')
            result+ Stars
            else 
                result+ twoDimensionalDigit(timeDigit.toString.toInt)
            }
        }

// this is an alternate version of the formatted method where there is an additional var , and we got rid of it in the above formatted
// private def formatted2(time:LocalDateTime,pattern:String): twoDimensionalString = {
//     var result: twoDimensionalString = twoDimensionalString.Empty
//     oneDimensional(time,pattern) foreach { timeDigit =>
//         if(timeDigit == ':')
//         result+= Stars
//         else 
//             result+= twoDimensionalDigit(timeDigit.toString.toInt)
//     }
//     result
//         }

        private def oneDimensional(time:LocalDateTime,pattern:String)={
        time.format(DateTimeFormatter.ofPattern(pattern))
    }
    

}
