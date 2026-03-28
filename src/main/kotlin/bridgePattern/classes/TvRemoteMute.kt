package bridgePattern.classes

import bridgePattern.classes.base.EntertainmentDevice
import bridgePattern.classes.base.RemoteButton

/**
 * This is the mute remote class which is an sub class of [RemoteButton]
 */
class TvRemoteMute(newDevice: EntertainmentDevice) : RemoteButton(newDevice) {

    override fun buttonNinePressed() {
        println("Button nine is pressed and TV was Muted!")
    }

}