package observerPattern.interfaces

/**
 * The subject interface which has the functions for register, unregister and notify observer.
 */
interface Subject {
    fun register(observer:Observer)
    fun unregister(observer:Observer)
    fun notifyObserver()
}