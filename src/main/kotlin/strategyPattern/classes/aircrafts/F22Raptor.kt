package strategyPattern.classes.aircrafts

import strategyPattern.classes.base.Aircraft
import strategyPattern.engine.PW_F119

class F22Raptor : Aircraft()
{
    init {
        setName("F-22 Raptor")
        setManuFacture("Lockheed Martin Aeronautics")
        setWingSpan(13.56)
        setLength(18.90)
        setHeight(5.09)
        setEngine(PW_F119()) // Here we are setting the engine to 'PW F119'
    }
}