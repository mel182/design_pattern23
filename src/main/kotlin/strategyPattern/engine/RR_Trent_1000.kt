package strategyPattern.engine

import strategyPattern.interfaces.Engine

/**
 * This is the Rolls Royce Trent 1000 class which inherit the Engine interface
 * @author Melchior Vrolijk
 */
class RR_Trent_1000 : Engine {
    override fun model(): String {
        return "Trent 1000"
    }

    override fun manufacture(): String {
        return "Rolls-Royce"
    }

    override fun thrust(): Double {
        return 360.4
    }

    override fun thrustUnit(): String {
        return "kN"
    }
}