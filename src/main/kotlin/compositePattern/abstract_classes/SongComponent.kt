package compositePattern.abstract_classes

import java.lang.UnsupportedOperationException

/**
 * This is the main song component abstract class which contain the main function that can be used.
 * @author Melchior Vrolijk
 */
abstract class SongComponent {

    //region Add
    // In case it is not used it will throw an UnsupportedOperationException
    open fun add(songComponent: SongComponent)
    {
        throw UnsupportedOperationException()
    }
    //endregion

    //region Remove
    // In case it is not used it will throw an UnsupportedOperationException
    protected open fun remove(songComponent: SongComponent)
    {
        throw UnsupportedOperationException()
    }
    //endregion

    //region Get component
    // In case it is not used it will throw an UnsupportedOperationException
    protected open fun getComponent(index:Int): SongComponent
    {
        throw UnsupportedOperationException()
    }
    //endregion

    //region Display song info
    // In case it is not used it will throw an UnsupportedOperationException
    open fun displaySongInfo()
    {
        throw UnsupportedOperationException()
    }
    //endregion
}