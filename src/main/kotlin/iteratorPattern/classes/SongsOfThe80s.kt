package iteratorPattern.classes

import iteratorPattern.model.SongInfo
import iteratorPattern.interfaces.SongIterator

class SongsOfThe80s: SongIterator<SongInfo> {

    private var bestSongs: Array<SongInfo> = arrayOf()

    init {
        addSongs("Roam","B52s",1989)
        addSongs("Cruel Summer","Bananarama",1984)
        addSongs("Head Over Heels","Tears for Fears",1985)
    }

    fun addSongs(songName:String, bandName:String, yearRelease:Int) {
        bestSongs += SongInfo(songName = songName, bandName = bandName, yearReleased = yearRelease)
    }

    override fun createIterator(): Iterable<SongInfo> = bestSongs.asIterable()
}