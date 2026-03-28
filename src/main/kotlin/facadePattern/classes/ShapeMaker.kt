package facadePattern.classes

import facadePattern.interfaces.Shape

class ShapeMaker {

    private var circle: Shape = Circle()
    private var rectangle: Shape = Rectangle()
    private var square: Shape = Square()

    fun drawCircle()
    {
        circle.draw()
    }

    fun drawRectangle()
    {
        rectangle.draw()
    }

    fun drawSquare()
    {
        square.draw()
    }
}