package Person_case_class
import Person_case_class.Human
import Person_case_class.Person

object person_Main{
    def main(args:Array[String]):Unit= {
        println("-"*175)
        code(args)
        println("-"*175)
    }

    def code(args:Array[String]):Unit = {
        val person = Person(name = "Bob", age = 19, isMale = true)
        println(person.isMale)
        println(person.isFemale)
        println(person)
        println(Person)
        println(Person.isInstanceOf[Function3[_, _, _, _]])
        println(person == Person(name = "Bob", age = 19, isMale = true))

        val persons: Set[Person] = Set(
            person,
            Person(name = "Bob", age = 20, isMale = true),
            Person(name = "Bob", age = 21, isMale = true),
            Person(name = "Bob", age = 22, isMale = true),
            Person(name = "Bob", age = 23, isMale = true),
        )

        println(persons.contains(Person(name = "Bob", age = 19, isMale = true)))
        println(person.isInstanceOf[Product])
        println(person.productPrefix)
        println(person.productElement(0))
        println(person.productArity)
        println(person.productIterator.mkString(", "))
        println()
        person match {
            case Person(name, age, isMale) => println(age)
        }

        println(Console.MAGENTA + ("-"*175) + Console.RESET)
        
        val human = Human(name = "Bob", age = 19, isMale = true)
        println(human.isMale)
        println(human.isFemale)
        println(human)
        println(Human)
        println(Human.isInstanceOf[Function3[_, _, _, _]])
        println(human == Human(name = "Bob", age = 19, isMale = true))

        val humans: Set[Human] = Set(
            human,
            Human(name = "Bob", age = 20, isMale = true),
            Human(name = "Bob", age = 21, isMale = true),
            Human(name = "Bob", age = 22, isMale = true),
            Human(name = "Bob", age = 23, isMale = true),
        )

        println(humans.contains(Human(name = "Bob", age = 19, isMale = true)))
        println(human.isInstanceOf[Product])
        println(human.productPrefix)
        println(human.productElement(0))
        println(human.productArity)
        println(human.productIterator.mkString(", "))
        println()
        human match {
            case Human(name, age, isMale) => println(age)
        }    
    }

}