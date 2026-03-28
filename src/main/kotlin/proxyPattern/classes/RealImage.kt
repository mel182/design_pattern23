package proxyPattern.classes

import proxyPattern.interfaces.Image

class RealImage(private val filename:String?) : Image
{
    init {
        loadFromDisk(filename)
    }

    override fun display() {
        println("Displaying ${filename}")
    }

    private fun loadFromDisk(fileName:String?) {
        println("Loading ${fileName}")
    }
}