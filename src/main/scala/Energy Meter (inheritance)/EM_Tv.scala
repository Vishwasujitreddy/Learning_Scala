class Tv extends Device{
    override val wattsPerSecond:Int =500
    override protected def actuallyTurnOn():Unit = {
        println("tv on")
    }
    override protected def actuallyTurnOff():Unit = {
        println("tv off")
    }
}
