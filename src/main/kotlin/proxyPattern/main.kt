package proxyPattern

import proxyPattern.classes.ProxyImage
import proxyPattern.classes.RealImage

fun main() {
    println("Main function called!")

    val image = ProxyImage("image.jpg")
    image.display()
    println("")
    image.display()
}