
object AnonymousFunction{
    def main(args:Array[String]) = {
        var result1 = (a:Int,b:Int) => a+b
        var result2 = (_:Int)+(_:Int)
        println(result1(10,10))
        println(result2(10,10))
    }
}

object curryingFunction{
    def add(a:Int)(b:Int):Int = {
        a+b
    }
    def main(args:Array[String])={
        var result = add(10)(10)
        println("10+10 ="+ result)
        var addIt = add(10)_
        var result2 = addIt(10)
        println(result2)
    }
}

object HigherOrderFunction{
                     //(number, input a function)
    def functionExample(a:Int, f:Int => AnyVal) = {
        println(f(a))
    }
    def multiplyBy2(a:Int) = {
        a*2
    }
    def main(args: Array[String])= {
        functionExample(250,multiplyBy2)
    }
}

object compositonFunction{
    def main(args:Array[String]) = {
        var result =multiplyBy2(add2(11))
        println(result)
    }
    def multiplyBy2(a :Int) :Int = {
        a*2
    }
    def add2(a:Int):Int={
        a+2
    }
}
