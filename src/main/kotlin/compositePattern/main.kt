package compositePattern

import compositePattern.abstract_classes.SongComponent
import compositePattern.classes.DJ
import compositePattern.classes.Song
import compositePattern.classes.SongGroup

fun main() {

    val heavyMetal:SongComponent = SongGroup("Heavy Metal","is a genre of rock that developed in the late 1960's")
    val rap:SongComponent = SongGroup("Rap","is a musical form of vocal delivery that incorporates \"rhyme, rhythmic speech, and street vernacular\", which is performed or chanted in a variety of ways, usually over a backing beat or musical accompaniment.")
    val hipHop:SongComponent = SongGroup("Hip Hop","is a genre of popular music developed in the United States by inner-city African Americans and Latino Americans in the Bronx borough of New York City in the 1970s.")

    val everySong = SongGroup("Song list","All available songs")

    heavyMetal.add(Song("Enter Sandman","Metallica",1991))
    heavyMetal.add(Song("The Unforgiven","Metallica",1991))

    rap.add( Song("Sing for the Moment","Eminem",2003))
    rap.add( Song("Poppin' Them Thangs","G-Unit",2003))
    hipHop.add(Song("Encore","Jay-Z",2003))
    rap.add(hipHop)

    everySong.add(heavyMetal)
    everySong.add(rap)

    val dj = DJ(everySong)
    dj.getSongList()
}