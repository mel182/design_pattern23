package compositePattern.classes

import compositePattern.abstract_classes.SongComponent

/**
 * This is the DJ class that holds the entire song list
 * @author Melchior Vrolijk
 */
data class DJ(val songList:SongComponent) {

    //region Get song list
    fun getSongList()
    {
        songList.displaySongInfo()
    }
    //endregion
}