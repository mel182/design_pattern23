package observerPattern.classes

import observerPattern.interfaces.Observer
import observerPattern.interfaces.Subject

/**
 * Stock observer is the observer subscribe to receive price update
 */
class StockObserver(stockGrabber:Subject) : Observer
{
    private var ibmPrice = 0.0
    private var googPrice = 0.0
    private var aaplPrice = 0.0
    private var observerID = 0

    init {
        this.observerID = ++observerIDTracker
        println("New observer "+this.observerID)
        stockGrabber.register(this) // Register itself to stock grabber
    }

    // Update stock prices
    override fun update(ibmPrice: Double, aaplPrice: Double, googPrice: Double) {
        this.ibmPrice = ibmPrice
        this.googPrice = googPrice
        this.aaplPrice = aaplPrice
        printPrices()
    }

    // Print stock prices
    private fun printPrices()
    {
        println("$observerID\nIBM: $ibmPrice\nAAPL: $aaplPrice\nGOOG: $googPrice")
    }

    companion object{
        private var observerIDTracker = 0 // Observer ID tracker
    }
}