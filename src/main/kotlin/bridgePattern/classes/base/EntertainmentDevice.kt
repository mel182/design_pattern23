package bridgePattern.classes.base

/**
 * This is the entertainment device abstract class
 */
abstract class EntertainmentDevice {

    var deviceState:Int = 0
    var maxSetting:Int = 0
    var volumeLevel:Int = 0

    abstract fun buttonFivePressed()
    abstract fun buttonSixPressed()

    fun deviceFeedback(){

        if(deviceState > maxSetting || deviceState < 0)
        {
            println("On ${deviceState}")
        }
    }

    fun buttonSevenPressed(){
        volumeLevel++

        println("Volume at: ${volumeLevel}")
    }

}