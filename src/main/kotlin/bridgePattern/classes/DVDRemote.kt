package bridgePattern.classes

import bridgePattern.classes.base.EntertainmentDevice
import bridgePattern.classes.base.RemoteButton

class DVDRemote(newDevice: EntertainmentDevice) : RemoteButton(newDevice) {

    override fun buttonNinePressed() {
        println("DVD button nine pressed!")
    }

}