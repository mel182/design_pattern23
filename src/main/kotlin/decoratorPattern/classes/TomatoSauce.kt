package decoratorPattern.classes

import decoratorPattern.interfaces.Pizza

class TomatoSauce(tempPizza: Pizza) : ToppingDecorator(tempPizza)
{

    init {
        println("Adding Sauce")
    }

    override fun getDescription(): String {
        return "${tempPizza.getDescription()}, Tomato Sauce"
    }

    override fun getCost(): Double {
        return tempPizza.getCost() + .35
    }

}