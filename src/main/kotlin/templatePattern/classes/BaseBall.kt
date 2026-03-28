package templatePattern.classes

/**
 * Create concrete classes extending the [Game] class.
 * @author Melchior Vrolijk
 */
class BaseBall : Game() {

    override fun initialize() {
        println("Baseball initialized, start playing!")
    }

    override fun startPlay() {
        println("Baseball game started. Enjoy your game!")
    }

    override fun endPlay() {
        println("Baseball game ended!")
    }
}