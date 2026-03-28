package strategyPattern.classes.aircrafts

import strategyPattern.classes.base.Aircraft
import strategyPattern.engine.GEnx
import strategyPattern.engine.RR_Trent_1000

class Boeing787_10 : Aircraft()
{
    init {
        setName("Boeing 787-10")
        setManuFacture("Boeing")
        setWingSpan(60.1)
        setLength(68.3)
        setHeight(5.94)
        setEngine(RR_Trent_1000()) // Here we are setting the engine to 'RR trent 1000'
    }
}