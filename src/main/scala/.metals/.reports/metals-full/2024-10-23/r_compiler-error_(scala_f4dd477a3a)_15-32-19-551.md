file:///D:/Practise/hello-world/src/main/scala/Anonymous_Partial.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Vishwasujit/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/collection/immutable/Seq.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1675
uri: file:///D:/Practise/hello-world/src/main/scala/Anonymous_Partial.scala
text:
```scala
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
        
        val totalFunctionWithoutSyntacticalSugar/* : Function1[Int,String] */ = new Function1[Int,String]{
            override def apply(argument: Int): String = 
                "\"" + argument + "\""
        }
        val partialFunctionWithoutSyntacticalSugar: PartialFunction[Int,String] = new PartialFunction[Int,String]{
            override def apply(argument: Int): String = {
                if(argument==4)
                    "\"" + argument + "\""
                else
                    sys.error("You have to call isDefined(5) before calling apply(5)")
            }
            override def isDefinedAt(argument: Int): Boolean = argument==4
        }

        val randomNumber = scala.util.Random.nextInt

        // println(" "+4)
        // println(totalFunction(4))
        // println(totalFunctionWithoutSyntacticalSugar(4))
        // println()
        // println(" "+4)
        // println(partialFunctionWithoutSyntacticalSugar(5))
        // println(partialFunction(4))

        val range = 1 to 10
        // range foreach println
        val function:Int => Int = _+1
        // range map function foreach println
        val predicate:Int => Boolean = _ == 4
        // range filter predicate foreach println
        range filter predicate m@@




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

    }
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

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Vishwasujit/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/collection/immutable/Seq.scala