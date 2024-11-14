// define a case class
case class Person_1(
  name: String,
  vocation: String
)
object Case_class{
    // create an instance of the case class
    def main(args: Array[String]):Unit ={
        val p = Person_1("Reginald Kenneth Dwight", "Singer")
        val p2 = Person_1("Anil kumar mureboina", "Full Stack Developer")
        // a good default toString method
        println(p)               // : Person = Person(Reginald Kenneth Dwight,Singer)
        

        // can access its fields, which are immutable
        println(p.name)           // "Reginald Kenneth Dwight"

        // when you need to make a change, use the `copy` method
        // to “update as you copy”
        val p3 = p.copy(name = "Elton John") // : Person = Person(Elton John,Singer)              
        println(p2)
        println(p3)
    }

}
