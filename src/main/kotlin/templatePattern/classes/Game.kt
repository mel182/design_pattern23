package templatePattern.classes

/**
 * Create an abstract class with a template method being final.
 * @author Melchior Vrolijk
 */
abstract class Game {

    abstract fun initialize()
    abstract fun startPlay()
    abstract fun endPlay()

    fun play() {

        //initialize the game
        initialize()

        //start game
        startPlay()

        //end game
        endPlay()
    }
}