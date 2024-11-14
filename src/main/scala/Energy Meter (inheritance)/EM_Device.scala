
trait Device{
   def wattsPerSecond:Int ={
    sys.error("please assign a value first")
    }
   private  var _isOn:Boolean = false
   def isOn:Boolean = _isOn
   protected  def isOn_=(newValue:Boolean): Unit={ //setter syntax
        _isOn = newValue
   }
   def isOff:Boolean = !isOn
        protected  def isOff_=(newValue:Boolean): Unit={ //setter syntax
        _isOn = !newValue
   }
   
   final def turnOn():Unit = {
    if(isOff){
        isOn = true
        actuallyTurnOn()
    }
    else
        sys.error("Already on")
   }
   protected def actuallyTurnOn():Unit 
   
   def turnOff():Unit = {
       if(isOn){
           isOff = true
           actuallyTurnOff()
       }
       else
           sys.error("Already off")
   }
   protected def actuallyTurnOff():Unit
}