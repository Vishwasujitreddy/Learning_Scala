class EnergyMeter(device:Device){
    private var _turnedOnAtMillis: Long = 0
    private var _wattsConsumedInTotal:Double = 0
    
    def startMeasuring():Unit ={
        device.turnOn()           
        _turnedOnAtMillis = System.currentTimeMillis
    }
    
    def stopMeasuring():Unit ={
        device.turnOff()
        val durationInMillis = System.currentTimeMillis - _turnedOnAtMillis
        val durationInSeconds = durationInMillis.toDouble / 1000
        wattsConsumedInTotal += device.wattsPerSecond * durationInSeconds
        
    }
    
    def wattsConsumedInTotal: Double = _wattsConsumedInTotal
    
    private def wattsConsumedInTotal_=(newValue:Double): Unit = {
        _wattsConsumedInTotal = newValue
    }
}