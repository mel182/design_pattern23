package compositePattern.classes

import compositePattern.abstract_classes.SongComponent

/**
 * This is the song group model class
 * @author Melchior Vrolijk
 */
data class SongGroup(val groupName:String, val groupDescription:String) : SongComponent()
{
    val songComponents = ArrayList<SongComponent>()

    //region Add
    override fun add(songComponent: SongComponent)
    {
        songComponents.add(songComponent)
    }
    //endregion

    //region Remove
    override fun remove(songComponent: SongComponent)
    {
        songComponents.remove(songComponent)
    }
    //endregion

    //region Get component
    override fun getComponent(index: Int): SongComponent
    {
        return songComponents[index]
    }
    //endregion

    //region Display song info
    override fun displaySongInfo() {
        println("$groupName $groupDescription\n")

        for (songComponent in songComponents) {
            songComponent.displaySongInfo()
        }
    }
    //endregion
}