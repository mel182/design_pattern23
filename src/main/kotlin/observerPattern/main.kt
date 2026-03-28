package observerPattern

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import observerPattern.classes.GetTheStock
import observerPattern.classes.StockGrabber
import observerPattern.classes.StockObserver

/**
 * This is an example of the observer pattern. In this example we are going to implement a Stock observer were all classes that subscribe is going to get update related to stock prices.
 */
fun main() {

    val stockGrabber = StockGrabber() // Stock grabber instance which implement the 'Subject' interface that handles register,unregister and notify observers.

    val observer1 = StockObserver(stockGrabber) // Create an observer 1 and register it

    // Set dummy stock prices for observer one
    stockGrabber.setIbmPrice(197.00) //each one notifies the subscribers of the price update
    stockGrabber.setApplPrice(677.60) //each one notifies the subscribers of the price update
    stockGrabber.setGoogPrice(676.40) //each one notifies the subscribers of the price update

    val observer2 = StockObserver(stockGrabber) // Create an observer 2 and register it

    // Set dummy stock prices for observer one
    stockGrabber.setIbmPrice(197.00) //each one notifies the subscribers of the price update
    stockGrabber.setApplPrice(677.60) //each one notifies the subscribers of the price update
    stockGrabber.setGoogPrice(676.40) //each one notifies the subscribers of the price update

    stockGrabber.unregister(observer1) // Unregister observer 1

    stockGrabber.setIbmPrice(197.00) //each one notifies the subscribers of the price update
    stockGrabber.setApplPrice(677.60) //each one notifies the subscribers of the price update
    stockGrabber.setGoogPrice(676.40) //each one notifies the subscribers of the price update

    stockGrabber.setIbmPrice(197.00) //each one notifies the subscribers of the price update
    stockGrabber.setApplPrice(677.60) //each one notifies the subscribers of the price update
    stockGrabber.setGoogPrice(676.40) //each one notifies the subscribers of the price update

    // This is an example of updating stock prices every 2 sec using coroutines
    runBlocking {
        launch(Dispatchers.IO) {
            while(true)
            {
                delay(2000)
                GetTheStock(stockGrabber,"IBM",197.00).update() // Update IBM price
                GetTheStock(stockGrabber,"AAPL",677.00).update() // Update Apple price
                GetTheStock(stockGrabber,"GOOG",676.40).update() // Update Google price
            }
        }
    }

}