package decoratorPattern.classes

import decoratorPattern.interfaces.Pizza

abstract class ToppingDecorator(val tempPizza: Pizza) : Pizza {

    override fun getDescription(): String {
        return tempPizza.getDescription()
    }

    override fun getCost(): Double {
        return tempPizza.getCost()
    }

}