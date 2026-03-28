package bridgePattern.classes

import bridgePattern.classes.base.EntertainmentDevice

/**
 * This is the tv device class which is a sub class of [EntertainmentDevice]
 */
class TvDevice(private var newDeviceState:Int, private var newMaxSetting:Int) : EntertainmentDevice()
{
    override fun buttonFivePressed() {
        println("Channel Down")

        deviceState--
    }

    override fun buttonSixPressed() {
        println("Channel Up")

        deviceState++
    }


}