file:///D:/Practise/hello-world/src/main/scala/Case_Classes.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Vishwasujit/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/Int.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1572
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
        // val tuple = ("My Favourite String",1337, true)        
        
        // tuple match {
        //     // case t => println(t._2) //pattern matching
        //     // case Tuple3(_,number,_) => println(number) // constructor matching
        //     case (_,number,_) => println(number) //tuple matching
        // }
        val tuple = new T3("My Favourite String",1337, true)
        println(tuple._2)

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
) extends Product3[String, Int, Boolean]{
    // Members declared in scala.Equals
  def canEqual(that: Any): Boolean = that.isInstanceOf[T3]
}

object P3 extends Product {
    // Members declared in scala.Equals
  def canEqual(that: Any): Boolean = that.isInstanceOf[T3]
  
  // Members declared in scala.Product
  def productArity: Int = 3
  def productElement(n: Int): Any = n m@@
}
```



#### Error stacktrace:

```
java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:182)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:153)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
	java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
	java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:232)
	java.base/java.nio.file.Path.of(Path.java:147)
	java.base/java.nio.file.Paths.get(Paths.java:69)
	scala.meta.io.AbsolutePath$.apply(AbsolutePath.scala:58)
	scala.meta.internal.metals.MetalsSymbolSearch.$anonfun$definitionSourceToplevels$2(MetalsSymbolSearch.scala:70)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.MetalsSymbolSearch.definitionSourceToplevels(MetalsSymbolSearch.scala:69)
	dotty.tools.pc.completions.CaseKeywordCompletion$.sortSubclasses(MatchCaseCompletions.scala:326)
	dotty.tools.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:276)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:307)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:109)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:90)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:146)
```
#### Short summary: 

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Vishwasujit/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/Int.scala