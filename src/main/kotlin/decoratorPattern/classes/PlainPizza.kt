package decoratorPattern.classes

import decoratorPattern.interfaces.Pizza

class PlainPizza : Pizza {
    override fun getDescription(): String {
        return "Thin Dough"
    }

    override fun getCost(): Double {
        return 4.00
    }
}