package bridgePattern.classes

import bridgePattern.classes.base.EntertainmentDevice
import bridgePattern.classes.base.RemoteButton

/**
 * This is the pause remote class which is an sub class of [RemoteButton]
 */
class TVRemotePause(newDevice: EntertainmentDevice) : RemoteButton(newDevice) {

    override fun buttonNinePressed() {
        println("TV was Paused!")
    }

}