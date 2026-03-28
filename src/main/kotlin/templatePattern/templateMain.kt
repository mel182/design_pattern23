package templatePattern

import templatePattern.classes.BaseBall
import templatePattern.classes.Football
import templatePattern.classes.Game

/**
 * In Template pattern, an abstract class exposes defined way(s)/template(s)
 * to execute its methods. Its subclasses can override the method implementation
 * as per need but the invocation is to be in the same way as defined by an
 * abstract class. This pattern comes under behavior pattern category.
 *
 * In this file we will use the Game's template method play() to demonstrate
 * a defined way of playing game.
 * @author Melchior Vrolijk
 */
fun main() {
    println("Main function called!")

    var game:Game = BaseBall()
    game.play()
    println()
    game = Football()
    game.play()

}