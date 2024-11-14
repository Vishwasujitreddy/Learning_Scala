file:///D:/Practise/hello-world/src/main/scala/racing%20game/Modification.scala
### java.lang.IllegalArgumentException: Comparison method violates its general contract!

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1125
uri: file:///D:/Practise/hello-world/src/main/scala/racing%20game/Modification.scala
text:
```scala
import Core.OrdinaryCar
object  Modification{
    trait spoiler extends Base.Car {
        abstract override def topSpeedInKmPerHour: Int = {
            (super.topSpeedInKmPerHour*1.02).toInt
        }
    }
    trait EngineControlUnit extends Core.OrdinaryCar{
        override def topSpeedInKmPerHour: Int =(super.topSpeedInKmPerHour*1.5).toInt
    }
    trait TurboCharger extends Core.OrdinaryCar{
        override def topAccelerationInRpm: Int = (super.topAccelerationInRpm*1.25).toInt
    }
    //set

    trait CaseIgnorance extends java.util.Set[String] {
        abstract override def add(element:String) = 
            super.add(element.toLowerCase)
        abstract override def contains(element:Any) =
            super.contains(element.asInstanceOf[String].toLowerCase)
        abstract override def remove(element:Any) = 
            super.remove(element.asInstanceOf[String].toLowerCase)
    }

    trait Logging extends java.util.Set[String]{
        abstract override def add(element:String) = 
            super.add(element)
        abstract override def remove(element:Any) =
            super.remove(elem@@)
    }
}

```



#### Error stacktrace:

```
java.base/java.util.TimSort.mergeLo(TimSort.java:781)
	java.base/java.util.TimSort.mergeAt(TimSort.java:518)
	java.base/java.util.TimSort.mergeCollapse(TimSort.java:448)
	java.base/java.util.TimSort.sort(TimSort.java:245)
	java.base/java.util.Arrays.sort(Arrays.java:1233)
	scala.collection.SeqOps.sorted(Seq.scala:728)
	scala.collection.SeqOps.sorted$(Seq.scala:719)
	scala.collection.immutable.List.scala$collection$immutable$StrictOptimizedSeqOps$$super$sorted(List.scala:79)
	scala.collection.immutable.StrictOptimizedSeqOps.sorted(StrictOptimizedSeqOps.scala:78)
	scala.collection.immutable.StrictOptimizedSeqOps.sorted$(StrictOptimizedSeqOps.scala:78)
	scala.collection.immutable.List.sorted(List.scala:79)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:140)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:90)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:146)
```
#### Short summary: 

java.lang.IllegalArgumentException: Comparison method violates its general contract!