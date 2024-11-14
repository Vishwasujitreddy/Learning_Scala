import scala.util.control.Breaks._
object Operations{
    def main(args:Array[String])={
      val operations = new intermediataryStage()

        var status:String = scala.io.StdIn.readLine("Do you have any operations to perform today[Yes/No]\n").toLowerCase()
        breakable{

          while(status=="yes"){
          var inputDecision:String = scala.io.StdIn.readLine("Please enter what operation you want to perform to the records\n" +
          "1. Enter \n" +
          "2. Update\n" +
          "3. Delete\n" +
          "4. View\n")

          val d  =inputDecision.toLowerCase match{
            case "1" | "1." | "enter"  => operations.addElement()
            case "2" | "2." | "update" => operations.alterElement()
            case "3" | "3." | "delete" => operations.deleteElement()
            case "4" | "4." | "view"   => operations.viewElements()
            case _ => println("this isn't a possible operation")  
        }
          if(scala.io.StdIn.readLine("Do you still have any operations left to perform today[Yes/No]\n").toLowerCase!="yes"){
          println("Alr gtfo")
          break
        }
        
    }
        }
        }
}
