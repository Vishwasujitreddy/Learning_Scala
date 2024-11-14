import scala.util.Success
class File(
location:String,
name:String,
extension:String,
content:String,
){
    def safeWrite(): Write.Result = {
        println(s"Writing '$content' to '$location' ...")
        Thread.sleep(1000)
        // Write.Success(content.size)
        // Write.Error("Permission Denied")
        Write.Warning("not enough disk space, please clear some stuff Up")
    }
    def convinientWrite(): Int = {
        println(s"Writing '$content' to '$location' ...")
        Thread.sleep(1000)
        throw Write.Error("not enough disk space, please clear some stuff Up")
        // content.size
        
    }
}

object Write{
    sealed trait Result
    final case class  Success(size:Int) extends Result
    final case class  Warning(message:String) 
        extends Throwable 
        with Result{
            override def toString(): String = s"$productPrefix($message)"
        }
        final case class  Error (message:String) 
        extends Throwable 
        with Result{
            override def toString(): String = s"$productPrefix($message)"
        }
}