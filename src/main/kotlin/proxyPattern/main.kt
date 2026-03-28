package proxyPattern

import proxyPattern.classes.ProxyImage

fun main() {
    println("Main function called!")

    val image = ProxyImage("image.jpg")
    image.display()
    println("")
    image.display()
}