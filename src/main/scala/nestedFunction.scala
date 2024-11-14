object nestedFunction{
    def add(a:Int,b:Int,c:Int):Int = {
        def add2(x:Int,y:Int):Int={
            x+y
        }
        add2(a,add2(b,c))
    }
    def main(args:Array[String])={
        var result= add(10,20,30)
        println(result)
    }
}