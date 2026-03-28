package factoryPattern

import factoryPattern.factory.EnemyShipFactory
import factoryPattern.models.EnemyShip
import java.util.Scanner

/**
 * The factory pattern is used when you want a method to return
 * one of several possible classes that share a common super class.
 *
 * When to use the factory pattern:
 *  - When you don't know ahead of time what class object you need.
 *  - When all of the potential classes are in the same subclass hierarchy
 *  - To centralize class selection code
 *  - When you don't want the user to have to know every subclass
 *  - To encapsulate object creation
 */
fun main() {

    val factory = EnemyShipFactory()
    var theEnemy: EnemyShip? = null
    val userInput = Scanner(System.`in`)
    var enemyShipOption = ""
    println("What type of ship? (U / R / B)")

    if (userInput.hasNextLine()) {
        enemyShipOption = userInput.nextLine()
        theEnemy = factory.makeEnemyShip(newShipType = enemyShipOption)
    }

    if (theEnemy == null) {
        println("Enter a U, R, B next time")
        return
    }

    doStuff(theEnemy)
}

fun doStuff(enemyShip: EnemyShip?) {

    enemyShip?.apply {
        followHeroShip()
        displayEnemyShip()
        enemyShipShoots()
    }

}