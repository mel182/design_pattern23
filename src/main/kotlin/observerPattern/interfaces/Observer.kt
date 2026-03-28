package observerPattern.interfaces

/**
 * This is the observer interface which contain the function of updating stock prices
 */
interface Observer
{
    fun update(ibmPrice:Double, aaplPrice: Double, googPrice:Double)
}