package Person_case_class

final case class Person(name:String, age:Int, isMale:Boolean){
    def isFemale:Boolean = !isMale
}
