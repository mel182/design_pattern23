package facadePattern.classes

import facadePattern.interfaces.Shape

class Rectangle : Shape {

    override fun draw() {
        println("Rectangle:draw")
    }
}