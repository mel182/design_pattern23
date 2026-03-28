package iteratorPattern.classes

import iteratorPattern.model.SongInfo
import iteratorPattern.interfaces.SongIterator

class DJ(private val songsOfThe70s: SongIterator<SongInfo>, private val songsOfThe80s: SongIterator<SongInfo>, private val songsOfThe90s: SongIterator<SongInfo>) {

    fun showTheSongs() {

        println("Songs of the 70s\n")
        songsOfThe70s.createIterator().forEach {
            println("Name: ${it.songName} - Band name: ${it.bandName} - Year release: ${it.yearReleased}")
        }
        println("")

        println("Songs of the 80s\n")
        songsOfThe80s.createIterator().forEach {
            println("Name: ${it.songName} - Band name: ${it.bandName} - Year release: ${it.yearReleased}")
        }
        println("")

        println("Songs of the 90s\n")
        songsOfThe90s.createIterator().forEach {
            println("Name: ${it.songName} - Band name: ${it.bandName} - Year release: ${it.yearReleased}")
        }
        println("")
    }
}