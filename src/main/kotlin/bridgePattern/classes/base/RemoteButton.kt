package bridgePattern.classes.base

import bridgePattern.classes.base.EntertainmentDevice

/**
 * This is the remote button abstract class
 */
abstract class RemoteButton(private var device: EntertainmentDevice) {

    fun buttonFivePressed()
    {
        device.buttonFivePressed()
    }

    fun buttonSixPressed()
    {
        device.buttonSixPressed()
    }

    fun deviceFeedback(){
        device.deviceFeedback()
    }

    abstract fun buttonNinePressed()

}