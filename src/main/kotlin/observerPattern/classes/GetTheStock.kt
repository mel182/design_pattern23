package observerPattern.classes

import observerPattern.interfaces.Subject
import java.text.DecimalFormat

/**
 * This is the get stock class which in this example send dummy price update to the subscribers
 */
data class GetTheStock(val stockGrabber: Subject, var newStock:String, var newPrice:Double) {

    private var price = 0.0

    // Update current price in the range of $-0.3 - $0.3
    fun update()
    {
        val randomNumber = (Math.random() * (.06)) - .03
        val decimalFormat = DecimalFormat("#.##")

        price = (decimalFormat.format((price+randomNumber))).toDouble()

        when(newStock)
        {
            "IBM" -> (stockGrabber as StockGrabber).setIbmPrice(price)
            "AAPL" -> (stockGrabber as StockGrabber).setApplPrice(price)
            "GOOG" -> (stockGrabber as StockGrabber).setGoogPrice(price)
        }

        println("$newStock: ${decimalFormat.format((price +randomNumber))} ${decimalFormat.format(randomNumber)}\n")
    }
}