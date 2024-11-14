
object EM_Main{
    def main(args:Array[String]):Unit = {
        println("-" * 161)

        code(args)

        println("-" * 161)
    }

    def code(args:Array[String]):Unit = {
        // object EnergyMeter{
            //     def apply(device:Any):EnergyMeter = {
                //         device match{
                    
                    //             case lightBulb: LightBulb =>{
                        //                 val lightBulb:LightBulb = device.asInstanceOf[LightBulb]
                        
                        //                 new EnergyMeter(
                            //                 wattsPerSecond  = lightBulb.wattsPerSecond,
                            //                 turnDeviceOn    = () => lightBulb.turnOn(),
                            //                 turnDeviceOff   = () => lightBulb.turnOff()
                            //             )
                            //             }
                            //             case tv:Tv => {
                                //                 val tv:Tv = device.asInstanceOf[Tv]
                                
                                //                 new EnergyMeter(
                                    //                 wattsPerSecond  = tv.wattsPerSecond,
                                    //                 turnDeviceOn    = () => tv.turnOn(),
                                    //                 turnDeviceOff   = () => tv.turnOff()
                                    //             )
                                    //             }
                                    //             case _ => sys.error("not a device")
                                    //         }
                                    // }
                                    // }
        
    val  tv = new Tv
    val lightBulb = new LightBulb
    val energyMeter = new EnergyMeter(lightBulb)
        
    energyMeter.startMeasuring()
    Thread.sleep(1000)
    energyMeter.stopMeasuring()
    println(energyMeter.wattsConsumedInTotal)
    
    println()
    
    energyMeter.startMeasuring()
    Thread.sleep(1000)
    energyMeter.stopMeasuring()
    println(energyMeter.wattsConsumedInTotal)

    }

}
