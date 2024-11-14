sealed abstract class CrustSize
object CrustSize{
    case object Small extends CrustSize
    case object Medium extends CrustSize
    case object Large extends CrustSize
}

sealed abstract class CrustType
object CrustType{
    case object Thin extends CrustType
    case object Thick extends CrustType
    case object Regular extends CrustType
}

sealed abstract class Toppings
object Toppings{
    case object Cheese extends Toppings
    case object Onion extends Toppings
    case object BlackOlives extends Toppings
    case object GreenOives extends Toppings
    case object Pepperoni extends Toppings
}