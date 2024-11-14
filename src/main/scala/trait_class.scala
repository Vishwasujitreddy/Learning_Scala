object animal_kingom{
    trait Speaker{
    def speak() : String
}

    trait TailWagger{
    def startTail() : Unit = println("Tail is wagging")
    def stopTail() : Unit = println("Tail stopped wagging")
}

    trait Runner{
    def startRunning() :Unit = println("Started to run")
    def stopRunning() : Unit = println("Stopped running")
}

    class Dog(name: String) extends Speaker with TailWagger with Runner {
    def speak() = "Woof!"
}

    class Cat(name: String) extends Speaker with TailWagger with Runner {
    def speak() = "Meow!"
    override def startRunning(): Unit = println("I dont run")
    override def stopRunning(): Unit = println("YEah sure man")

}

    def main(args: Array[String]) = {
    val d = new Dog("chimtu")
    println(d.speak())
    val c = new Cat("aish")
    println(c.speak())
    c.startRunning()
    c.stopRunning()
}
}


    