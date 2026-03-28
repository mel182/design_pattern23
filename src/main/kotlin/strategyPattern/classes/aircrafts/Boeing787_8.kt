package strategyPattern.classes.aircrafts

import strategyPattern.classes.base.Aircraft
import strategyPattern.engine.GEnx

/**
 * The Boeing787-8 class which inherit the Aircraft class
 * @author Melchior Vrolijk
 */
class Boeing787_8 : Aircraft()
{

    init {
        setName("Boeing 787-8")
        setManuFacture("Boeing")
        setWingSpan(60.1)
        setLength(56.7)
        setHeight(5.94)
        setEngine(GEnx()) // Here we are setting the engine to 'GEnx'
    }

}