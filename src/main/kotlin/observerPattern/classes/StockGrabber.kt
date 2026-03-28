package observerPattern.classes

import observerPattern.interfaces.Observer
import observerPattern.interfaces.Subject

/**
 * Stock grabber keep track of all observers and notify them about the price changes
 */
class StockGrabber : Subject {

    private val observers:ArrayList<Observer> = ArrayList()
    private var ibmPrice = 0.0
    private var applPrice = 0.0
    private var googPrice = 0.0

    // Register observer
    override fun register(observer: Observer) {
        observers.add(observer)
    }

    // Unregister observer
    override fun unregister(observer: Observer) {

        val observerIndex = observers.indexOf(observer)

        println("Observer ${observerIndex+1} deleted")

        observers.remove(observer)
    }

    // Notify observer
    override fun notifyObserver() {

        for (observer in observers) {
            observer.update(ibmPrice,applPrice,googPrice)
        }
    }

    // Set IBM dummy price
    fun setIbmPrice(price:Double)
    {
        this.ibmPrice = price
        notifyObserver()
    }

    // Set Apple dummy price
    fun setApplPrice(price:Double)
    {
        this.applPrice = price
        notifyObserver()
    }

    // Set Google dummy price
    fun setGoogPrice(price:Double)
    {
        this.googPrice = price
        notifyObserver()
    }
}