import java.io.File
import java.sql.Time
object Stain{
    def main(args:Array[String]):Unit = {
        println("-" * 167)

        code(args)

        println("-" * 167)
    }

    def code(args:Array[String]):Unit = {
        class Animal
        trait Pet{
            def allowedToSleepInBed:Boolean
            def disallowedToSleepInBed:Boolean = 
                !allowedToSleepInBed
        }
        class Cat extends Animal with Pet{
            var allowedToSleepInBed: Boolean = true
        }
        class Turtle extends Animal with Pet{
            def allowedToSleepInBed: Boolean = false
        }
        def show(pet:Pet):Unit = {
            println(pet.disallowedToSleepInBed)
        }
        // show(new Cat)
        // show(new Turtle)


        trait Timestamp{
            val creationTime:String = {

                val formatter = java.time
                                    .format
                                    .DateTimeFormatter
                                    .ofPattern("HH:mm:ss")
                java.time
                    .LocalDateTime
                    .now
                    .format(formatter)
            }
        }

        // class FileWithTimestamp(path:String) extends java.io.File(path) with Timestamp

        val path = "D:\\Practise\\hello-world\\src\\main\\scala\\traits.scala"
        // val file = new FileWithTimestamp(path)
        type namelessType = java.io.File with Timestamp
        val file: namelessType = new java.io.File(path) with Timestamp

        def showName(file:java.io.File):Unit = {
            println(file.getName())
        }
        //or
        // def showName(file:namelessType):Unit = {
        //     println(file.getName())
        // }

        def showCreationTime(timestamp:Timestamp):Unit = {
            println(timestamp.creationTime)
        }

        showName(file)
        showCreationTime(file)
    }
}