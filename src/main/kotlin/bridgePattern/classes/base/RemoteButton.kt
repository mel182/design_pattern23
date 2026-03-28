package bridgePattern.classes.base

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