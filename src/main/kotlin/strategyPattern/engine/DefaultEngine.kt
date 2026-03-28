package strategyPattern.engine

import strategyPattern.interfaces.Engine

/**
 * The default engine class
 * @author Melchior Vrolijk
 */
class DefaultEngine : Engine {

    override fun model(): String {
        return ""
    }

    override fun manufacture(): String {
        return ""
    }

    override fun thrust(): Double {
        return 0.0
    }

    override fun thrustUnit(): String {
        return ""
    }
}