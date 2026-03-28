package strategyPattern.engine

import strategyPattern.interfaces.Engine

/**
 * The GEnx class which inherit the Engine interface
 * @author Melchior Vrolijk
 */
class GEnx : Engine {

    override fun model(): String {
        return "GEnx"
    }

    override fun manufacture(): String {
        return "GE Aviation"
    }

    override fun thrust(): Double {
        return 310.0
    }

    override fun thrustUnit(): String {
        return "kN"
    }
}