package compositePattern.classes

import compositePattern.abstract_classes.SongComponent

/**
 * This is the song model class
 * @author Melchior Vrolijk
 */
data class Song(val name:String, val band:String, val releaseYear:Int ) : SongComponent()
{
    //region Display song info
    override fun displaySongInfo() {
        println("'$name' was recorded by $band in $releaseYear")
    }
    //endregion
}