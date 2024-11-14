import Modification.Logging

object RG_Main{
    def main(args:Array[String]):Unit = {
        println("-" * 161)

        code(args)

        println("-" * 161)
    }

    def code(args:Array[String]):Unit = {
        final class Lamborghini(override val model:String) 
        extends Core.SportsCar(model) 
        with Modification.spoiler

        final class BMW(override val model:String)
        extends Core.OrdinaryCar(model) 
        with Modification.EngineControlUnit
        with Modification.spoiler
        with Modification.TurboCharger{
        }

        // println(new Lamborghini("Mercielago"))
        //println(new BMW("M3"))
        
        //An example of traits and order of execution that help in modularity and code reusability
        val firstLogThenIgnoreCase = new java.util.HashSet[String] 
             with Modification.CaseIgnorance
             with Modification.Logging

         

        val firstIgnoreCaseThenLog = 
            new java.util.HashSet[String] 
             with Modification.Logging
             with Modification.CaseIgnorance
        //first prints out "Add: HI" then adds hi
        firstLogThenIgnoreCase.add("HI")
        
        //first adds hi then prints out "Add: hi"
        firstIgnoreCaseThenLog.add("HI")
    }
        
}
