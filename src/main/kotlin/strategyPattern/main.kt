package strategyPattern

import strategyPattern.classes.aircrafts.Boeing787_10
import strategyPattern.classes.aircrafts.Boeing787_8
import strategyPattern.classes.aircrafts.F22Raptor

/**
 * In this example we are going to demonstrates the implementation of the strategy pattern.
 * This is useful we have a long list of conditions.
 *
 * @author Melchior Vrolijk
 */
fun main() {

    //This is a boeing787-8 instance which inherit the Aircraft class
    val boeing7878 = Boeing787_8()
    println("Name: ${boeing7878.name}")
    println("Manufacture: ${boeing7878.manufacture}")
    println("Wingspan: ${boeing7878.wingspan}")
    println("Height: ${boeing7878.height}")
    println("Length: ${boeing7878.length}")

    // Since the engine difference from model to model,
    // it is a best practice to decouple it from the base class
    // since specification property has a lot of similarities
    println("Engine: ${boeing7878.engine.model()}")
    println("Engine thrust: ${boeing7878.engine.thrust()}")

    println()

    //This is a boeing787-10 instance which inherit the Aircraft class
    val boeing78710 = Boeing787_10()
    println("Name: ${boeing78710.name}")
    println("Manufacture: ${boeing78710.manufacture}")
    println("Wingspan: ${boeing78710.wingspan}")
    println("Height: ${boeing78710.height}")
    println("Length: ${boeing78710.length}")

    // Same here decouple it from the base class
    println("Engine: ${boeing78710.engine.model()}")
    println("Engine thrust: ${boeing78710.engine.thrust()}")

    println()

    //This is a F22 Raptor instance which inherit the Aircraft class
    val f22Raptor = F22Raptor()
    println("Name: ${f22Raptor.name}")
    println("Manufacture: ${f22Raptor.manufacture}")
    println("Wingspan: ${f22Raptor.wingspan}")
    println("Height: ${f22Raptor.height}")
    println("Length: ${f22Raptor.length}")

    // Same here decouple it from the base class
    println("Engine: ${f22Raptor.engine.model()}")
    println("Engine thrust: ${f22Raptor.engine.thrust()}")
}

