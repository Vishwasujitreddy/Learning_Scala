object imp extends App {
  def multiply(x: Int)(implicit y: Int) = x * y
  implicit val z: Int = 10

  println(multiply(3))
  println(multiply(4)(3))
}