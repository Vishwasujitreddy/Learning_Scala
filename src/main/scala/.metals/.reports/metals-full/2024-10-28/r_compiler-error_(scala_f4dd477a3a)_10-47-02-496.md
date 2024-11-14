file:///D:/Practise/hello-world/src/main/scala/Case_Classes.scala
### java.lang.StringIndexOutOfBoundsException: String index out of range: 1078

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1037
uri: file:///D:/Practise/hello-world/src/main/scala/Case_Classes.scala
text:
```scala
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
        val tuple = ("My Favourite String",1337, true)        
        
        tuple match {
            // case t => println(t._2) //pattern matching
            // case Tuple3(_,number,_) => println(number) // constructor matching
            case (_,number,_) => println(number) //tuple matching
        }
        //pattern to build tuple is as follows
        //trait Equals extends Any
        //trait Prodcut extends Equals
        //trait Product3[+T1, +T2, +T3] extends Product
        //final case class Tuple3[+T1, +T2, +T3] extends Product3[+T1, +T2, +T3]
    }
}

object @@T3 extends Product3[String, Int, Boolean]
```



#### Error stacktrace:

```
java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	java.base/java.lang.String.charAt(String.java:1512)
	dotty.tools.pc.completions.OverrideCompletions$.hasColon(OverrideCompletions.scala:507)
	dotty.tools.pc.completions.OverrideCompletions$.hasBracesOrColon(OverrideCompletions.scala:500)
	dotty.tools.pc.completions.OverrideCompletions$.implementAllFor(OverrideCompletions.scala:322)
	dotty.tools.pc.completions.OverrideCompletions$.implementAll$lzyINIT1$1$$anonfun$1(OverrideCompletions.scala:213)
	dotty.tools.pc.completions.OverrideCompletions$.implementAllAt(OverrideCompletions.scala:219)
	dotty.tools.pc.ScalaPresentationCompiler.implementAbstractMembers$$anonfun$1(ScalaPresentationCompiler.scala:271)
```
#### Short summary: 

java.lang.StringIndexOutOfBoundsException: String index out of range: 1078