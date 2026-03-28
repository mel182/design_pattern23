package facadePattern.classes

import facadePattern.interfaces.Shape

class Circle : Shape {
    override fun draw() {
        println("Circle:draw")
    }
}