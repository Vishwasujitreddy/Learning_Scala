object FP_Main{
    def main(args:Array[String]):Unit = {
        println("-" * 186)

        code(args)

        println("-" * 186)
    }

    def code(args:Array[String]):Unit = {
        // trait SimpleFunction1[-Input1,+Output1]{
        //     def apply(argument:Input1):Output1
        // }

        val totalFunction/* :Int =>String */ = 
            (argument:Int)=> "\"" + argument + "\""
        
        type ~>[-Input,+Output] = PartialFunction[Input,Output]
        
        
        val partialFunction: Int ~> String = {      // this is same as this "val partialFunction: ~>[Int,String] ="
            case 4 => "\"" + 4 + "\""
        } 
            // (argument:Int)=> "\"" + argument + "\""
            
        val totalFunctionWithoutSyntacticalSugar/* : Function1[Int,String] */ = new Function1[Int,String]{
            override def apply(argument: Int): String = 
                "\"" + argument + "\""
        }
        val partialFunctionWithoutSyntacticalSugar: PartialFunction[Int,String] = new PartialFunction[Int,String]{
            override def apply(argument: Int): String = {
                if(argument==4)
                    "\"" + argument + "\""
                else
                    sys.error(s"You have to call isDefined($argument) before calling apply($argument)")
            }
            override def isDefinedAt(argument: Int): Boolean = argument==4
        }

        val randomNumber = scala.util.Random.nextInt

        // println(" "+4)
        // println(totalFunction(4))
        // println(totalFunctionWithoutSyntacticalSugar(4))
        // println()
        // println(" "+4)
        // println(partialFunctionWithoutSyntacticalSugar(4))
        // println(partialFunction(4))

        val range = 1 to 10
        // range foreach println
        val function:Int => Int = _+1
        // range map function foreach println
        val predicate:Int => Boolean = _ == 4
        // range filter predicate foreach println
        // range filter predicate map totalFunction foreach println
        // range collect partialFunctionWithoutSyntacticalSugar foreach println /* collect is filter and then map. Its background implementation is below */
        
        // range foreach{number => 
            //     if(partialFunctionWithoutSyntacticalSugar.isDefinedAt(number))
            //         println(partialFunctionWithoutSyntacticalSugar(number))} /* this can also be written as println(partialFunctionWithoutSyntacticalSugar.apply(number)) */
        // range map partialFunctionWithoutSyntacticalSugar foreach println



        // example to show implementation of syntacical sugar 
        //                         |
        //                         |
        //                         v
        // class NamedFunction1(name:String) extends SimpleFunction1{
        //     override def apply(argument:String): Unit = {
        //         println(s"Hi I am $name. $argument")
        //     }
        // }

        // val singleton:SimpleFunction1 = new SimpleFunction1 {
        //     override def apply(argument:String): Unit = {
        //         println(s"Hi I am a singleton and it doesnt even make sense fo eme to have a constructor :(. $argument")
        //     }
        // }
        
        // val alice: SimpleFunction1 = new NamedFunction1("Alice")
        // val bob: SimpleFunction1 = new NamedFunction1("Bob")

        // singleton("I am sexy and I know it")
        // alice("How are you doing")
        // bob("What Up dawg?")

        //---------implementing new roman numerals------------------------
        
        def toRomanNumeralsDigits(number:Int):String = {
            val partialFunction1:Int ~> String  = {
                case 0  =>   "0 : N"
                case 1  =>   "1 : I"
                case 2  =>   "2 : II"
                case 3  =>   "3 : III"
                case 4  =>   "4 : IV"
                case 5  =>   "5 : V"
                case 6  =>   "6 : VI"
                case 7  =>   "7 : VII"
                case 8  =>   "8 : VIII"
                case 9  =>   "9 : IX"
                case 10 =>   "10: X"
            }
            partialFunction1(number)
        }
        val onlyEvenDigits:Int ~> String = {
            case 0  =>   "0 : N"
            case 2  =>   "2 : II"
            case 4  =>   "4 : IV"
            case 6  =>   "6 : VI"
            case 8  =>   "8 : VIII"
            case 10 =>   "10: X"
        }
        val onlyOddDigits:Int ~> String = {
            case 1  =>   "1 : I"
            case 3  =>   "3 : III"
            case 5  =>   "5 : V"
            case 7  =>   "7 : VII"
            case 9  =>   "9 : IX"
        }
        def toRomanNumeralsDigitsOrElse(number:Int):String = {
            val partialFunction1:Int ~> String  =
                onlyEvenDigits orElse onlyOddDigits
            partialFunction1(number)            
        }
            
        0 to 9 map toRomanNumeralsDigitsOrElse foreach println

    }
}