package decoratorPattern.classes

import decoratorPattern.interfaces.Pizza

class Mozzarella(tempPizza: Pizza) : ToppingDecorator(tempPizza){

    init {
        println("Adding Dough")
        println("Adding Moz")
    }

    override fun getDescription(): String {
        return "${tempPizza.getDescription()}, Mozzarella"
    }

    override fun getCost(): Double {
        return tempPizza.getCost() + .50
    }
}