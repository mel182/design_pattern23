package decoratorPattern

import decoratorPattern.classes.Mozzarella
import decoratorPattern.classes.PlainPizza
import decoratorPattern.classes.TomatoSauce

fun main() {
    println("Main function launch")

    val basicPizza = TomatoSauce(Mozzarella(PlainPizza()))
    println("Ingredients: ${basicPizza.getDescription()}")
    println("Price: ${basicPizza.getCost()}")

}