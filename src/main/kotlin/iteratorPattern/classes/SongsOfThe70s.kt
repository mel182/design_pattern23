package iteratorPattern.classes

import iteratorPattern.model.SongInfo
import iteratorPattern.interfaces.SongIterator

class SongsOfThe70s: SongIterator<SongInfo> {

    private val bestSongs: ArrayList<SongInfo> = ArrayList()

    init {
        addSongs("Imagine","John Lennon",1971)
        addSongs("American Pie","Don McLean",1971)
        addSongs("I will Survive","Gloria Gaynor",1979)
    }

    fun addSongs(songName:String, bandName:String, yearRelease:Int) {
        bestSongs.add(SongInfo(songName = songName, bandName = bandName, yearReleased = yearRelease))
    }

    override fun createIterator(): Iterable<SongInfo> {
        return bestSongs.asIterable()
    }
}