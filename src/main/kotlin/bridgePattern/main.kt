package bridgePattern

import bridgePattern.classes.TVRemotePause
import bridgePattern.classes.TvDevice
import bridgePattern.classes.TvRemoteMute

// This is an example of the Bridge design pattern in Kotlin
//
// What is the Bridge design pattern?
// - Decouple an abstraction from its implementation so that the two can vary independently
// - Progressively adding functionality while separating out major differences using abstract classes
//
// When to use this pattern?
// - When you want to able to change both the abstractions (abstract classes) and concrete classes independently
// - When you want the first abstract class to define rules (Abstract TV)
// - The concrete class adds additional rules (Concrete TV)
// - An abstract class has a reference to the device and it defines abstract methods that will be defined (Abstract Remote)
// - The concrete Remote defines the abstract methods required
fun main() {

    val tv = TvRemoteMute(TvDevice(1, 200))
    val tv2 = TVRemotePause(TvDevice(1, 200))

    println("Test tv with mute")
    tv.buttonFivePressed()
    tv.buttonSixPressed()
    tv.buttonNinePressed()

    println("\nTest tv with pause")
    tv2.buttonFivePressed()
    tv2.buttonSixPressed()
    tv2.buttonSixPressed()
    tv2.buttonSixPressed()
    tv2.buttonSixPressed()
    tv2.buttonNinePressed()
    tv2.deviceFeedback()



}