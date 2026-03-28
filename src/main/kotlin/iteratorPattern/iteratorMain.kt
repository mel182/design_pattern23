package iteratorPattern

import iteratorPattern.classes.DJ
import iteratorPattern.classes.SongsOfThe70s
import iteratorPattern.classes.SongsOfThe80s
import iteratorPattern.classes.SongsOfThe90s

/**
 * Iterator design pattern in one of the behavioral pattern.
 * Iterator pattern is used to provide a standard way to traverse through a group of Objects.
 * Iterator pattern is widely used in Java Collection Framework.
 * Iterator interface provides methods for traversing through a collection.
 */
fun main() {

    val songsOfThe70s = SongsOfThe70s()
    val songsOfThe80s = SongsOfThe80s()
    val songsOfThe90s = SongsOfThe90s()

    val dj = DJ(songsOfThe70s = songsOfThe70s, songsOfThe80s = songsOfThe80s, songsOfThe90s = songsOfThe90s)
    dj.showTheSongs()

}