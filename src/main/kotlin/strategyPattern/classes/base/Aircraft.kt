package strategyPattern.classes.base

import strategyPattern.engine.DefaultEngine
import strategyPattern.interfaces.Engine

/**
 * This is the aircraft base class which has the main properties
 * @author Melchior Vrolijk
 */
abstract class Aircraft
{
    var name:String = ""
        private set

    var manufacture:String = ""
        private set

    var wingspan:Double = 0.0
        private set

    var length:Double = 0.0
        private set

    var height:Double = 0.0
        private set

    //Here we has an instance of the Engine interfaces which can set to all the available Engines
    var engine: Engine = DefaultEngine() // The default engine instance in case it is not set
        private set

    protected fun setName(manufactureName:String)
    {
        this.name = manufactureName
    }

    protected fun setManuFacture(manufactureName:String)
    {
        this.manufacture = manufactureName
    }

    protected fun setWingSpan(wingspan:Double)
    {
        this.wingspan = wingspan
    }

    protected fun setLength(length:Double)
    {
        this.length = length
    }

    protected fun setHeight(height:Double)
    {
        this.height = height
    }

    //Setter for the engine interface instance
    fun setEngine(engine:Engine)
    {
        this.engine = engine
    }
}