package iteratorPattern.classes

import iteratorPattern.model.SongInfo
import iteratorPattern.interfaces.SongIterator
import java.util.Hashtable

class SongsOfThe90s: SongIterator<SongInfo> {

    private val bestSongs: Hashtable<Int, SongInfo> = Hashtable()
    private var hashKey = 0
    init {
        addSongs("Losing My Religion","REM",1991)
        addSongs("Creep","RadioHead",1993)
        addSongs("Walk on the Ocean","Toad the Wet Sprocket",1991)
    }

    fun addSongs(songName:String, bandName:String, yearRelease:Int) {
        bestSongs[hashKey] = SongInfo(songName = songName, bandName = bandName, yearReleased = yearRelease)
        hashKey++
    }

    override fun createIterator(): Iterable<SongInfo> = bestSongs.map { it.value }.toList().asIterable()
}