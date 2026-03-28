package strategyPattern.interfaces

/**
 * The engine interface that contain the main engine specs properties for this example
 * @author Melchior Vrolijk
 */
interface Engine {
    fun model():String
    fun manufacture():String
    fun thrust():Double
    fun thrustUnit():String
}