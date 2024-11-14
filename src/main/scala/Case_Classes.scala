object CC_Main{
    def main(args:Array[String]):Unit = {
        println("-" * 186)

        code(args)

        println("-" * 186)
    }

    def code(args:Array[String]):Unit = {
        // val tuple:Tuple3[String,Int,Boolean] = new Tuple3[String,Int,Boolean]("My Favourite String",1337, true)        
        // val tuple = new Tuple3("My Favourite String",1337, true)        
        // val tuple = Tuple3("My Favourite String",1337, true)        
        // val tuple = ("My Favourite String",1337, true)        
        
        // tuple match {
        //     // case t => println(t._2) //pattern matching
        //     // case Tuple3(_,number,_) => println(number) // constructor matching
        //     case (_,number,_) => println(number) //tuple matching
        // }
        val tuple = new T3("My Favourite String",1337, true)
        println(tuple._2)
        println(tuple.productArity)

    }
}

//pattern to build tuple is as follows
//trait Equals extends Any
//trait Prodcut extends Equals
//trait Product3[+T1, +T2, +T3] extends Product
//final case class Tuple3[+T1, +T2, +T3] extends Product3[+T1, +T2, +T3]

class T3(
    override val _1: String,
    override val _2: Int,
    override val _3: Boolean,
) extends P3

trait P3 extends Product {
    // Members declared in scala.Equals
  def canEqual(that: Any): Boolean = that.isInstanceOf[P3]
  
  // Members declared in scala.Product
  def productArity: Int = 3
  def productElement(n: Int): Any = n match{
    case 0 => _1
    case 1 => _2
    case 2 => _3
  }
  def _1:String
  def _2:Int
  def _3:Boolean
}