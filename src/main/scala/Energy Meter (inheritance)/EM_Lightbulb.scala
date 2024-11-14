class LightBulb extends Device{
    override val wattsPerSecond:Int =100
    protected def actuallyTurnOn():Unit = {
        println("Light bulb on")
    }
    protected def actuallyTurnOff():Unit = {
        println("Light bulb off")
    }
}
