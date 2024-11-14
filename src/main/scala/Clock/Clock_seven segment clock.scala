import Constants._
import scala.concurrent.duration._
import Scala._

object TickUntilEnterisPressed{
    def main(args: Array[String]): Unit={
        Scala.TickUntilEnterisPressed(interval){
        Terminal.clearCanvas()
        Terminal.goUp(lines = linesTogoUp)
        twoDimensionalTime.showCurrent(pattern = timePattern)
        }
        
    }
}

object TickforFewSeconds{
    def main(args: Array[String]): Unit={
        Scala.loop(times = fewSeconds){
        Terminal.clearCanvas()
        Terminal.goUp(lines = linesTogoUp)
        twoDimensionalTime.showCurrent(pattern = timePattern)
        Scala.wait(interval)
        }
        println()
    }

}

object Constants{
    val fewSeconds:Int = 20
    val timePattern:String = "hh:mm:ss"
    val interval: FiniteDuration = 1.second
    val linesTogoUp:Int  = Int.MaxValue
}