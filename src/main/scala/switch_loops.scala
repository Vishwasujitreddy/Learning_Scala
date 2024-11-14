
object practise{
    def getClassAsString(x: Any) : String = 
    x match{
        case s: String => s"'$s'is a string"
        case i: Int => "Int"
        case d: Double => "Double"
        case l: List[_] => "List"
        case _ => "unkown"
    }

    def main(args: Array[String]) = {
        var x = 0
        println(getClassAsString(94478))

        while (x < 3) {
         println(x)
        
             x += 1
        }  
    }
}

