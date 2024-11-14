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

    trait CaseIgnorance extends java.util.HashSet[String] {
        abstract override def add(element:String) = 
            super.add(element.toLowerCase)
        abstract override def contains(element:Any) =
            super.contains(element.asInstanceOf[String].toLowerCase)
        abstract override def remove(element:Any) = 
            super.remove(element.asInstanceOf[String].toLowerCase)
    }

    trait Logging extends java.util.HashSet[String]{
        abstract override def add(element:String) = {
            println(s"Add: $element")
            super.add(element)
        }
        abstract override def remove(element:Any) ={
            println(s"Remove: $element")
            super.remove(element)
        }
    }

}
