package facadePattern.classes

import facadePattern.interfaces.Shape

class Square : Shape {

    override fun draw() {
        println("Square:draw")
    }
}