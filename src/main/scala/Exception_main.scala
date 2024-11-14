import Helpers._

object Exception_main{
    def main(args :Array[String]):Unit = {
        println("-" * 175)

        code(args)

        println("-" * 175)
    }

    def code(args:Array[String]):Unit = {
        val file = new File(
            location = "D:Practise/hello-world/src/main/scala",
            name = "Exception_main",
            extension = ".scala",
            content = "Hello world!"
                )
        var diskUsage = 10 //bytes
        
        def happypath(size:Int):Unit = {
            showGreen("Life is good!")
            diskUsage += size
        }

        def safeCal():Unit = {
            try {
                val optionalSize = file.convinientWrite()
                happypath(optionalSize)
            }
            catch {
                case Write.Warning(message) => showYellow(message)
                case Write.Error(message) => showRed(message)
                case e:Throwable => showRed(e.toString())
            }
            finally
                println("finally")
        }
        safeCal()
        
        println(s"Disk usage: $diskUsage bytes")
        
        // optionalSize match{
        //     case Write.Success(size) => happypath(size)
        //     case Write.Warning(message) => showYellow(message)
        //     case Write.Error(message) => showRed(message)
        // }
    }
}
