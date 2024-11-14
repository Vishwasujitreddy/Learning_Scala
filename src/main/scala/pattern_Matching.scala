object PM_Main{
    def main(args:Array[String]):Unit = {
        println("-" * 186)

        code(args)

        println("-" * 186)
    }

    def code(args:Array[String]):Unit = {
        def method(input:Any):Any = { input match{
            case _ => s"$input"
        }
        }
        def show(input:Any):Unit = {
            println(method(input))
        }
        show(1)
        show(2.0)
        show(true)
        show(false)
        show("Hi")
        show('c')    
    }
}


















