package strategyPattern.engine

import strategyPattern.interfaces.Engine

/**
 * The Pratt & Whitney F119 engine class which inherit the Engine class
 * @author Melchior Vrolijk
 */
class PW_F119 : Engine {

    override fun model(): String {
        return "F119"
    }

    override fun manufacture(): String {
        return "Pratt & Whitney"
    }

    override fun thrust(): Double {
        return 116.0
    }

    override fun thrustUnit(): String {
        return "kN"
    }
}