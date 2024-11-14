import CrustSize._
object pizza{
    val currentCrustSize : CrustSize = Small
// enums in a `match` expression
    def main(args: Array[String])={
    currentCrustSize match {
        case Small => println("Small crust size")
        case Medium => println("Medium crust size")
        case Large => println("Large crust size")
}


}

    // enums in an `if` statement
    // if (currentCrustSize == Small) println("Small crust size")
}
