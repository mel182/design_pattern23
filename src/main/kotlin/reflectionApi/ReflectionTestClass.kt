package reflectionApi

class ReflectionTestClass: ReflectionInterface {

    private val idCode = "100"

    constructor(number:Int, randString: String) {
        println("You sent $number $randString")
    }

    fun getPrivate(): String = "How did you get this"

    fun getOtherPrivate(thisInt: Int, thatString: String): String = "How did you get here $thisInt $thatString"

    override fun interfaceMethod() {

    }

}