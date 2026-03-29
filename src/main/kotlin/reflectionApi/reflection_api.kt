package reflectionApi

import kotlin.reflect.KVisibility
import kotlin.reflect.full.superclasses

/**
 * This is an example of the class manipulator API in Java. Although the word 'Reflection'
 * is used often but a better way to explain it is to use the word 'Class manipulator'.
 * It is used to manipulate classes and everything in a class, but it also slow down a program because
 * the JVM can't optimize the code. Such API cannot be used with applets (the security is required) and should be used sparingly.
 */
fun main() {

    val reflectClass = ReflectionTestClass::class

    println("\n|-------------- ${reflectClass.simpleName} --------------|\n")

    if (reflectClass.visibility == KVisibility.PUBLIC) {
        println("${reflectClass.simpleName} is public!")
    } else {
        println("${reflectClass.simpleName} is not public.")
    }

    println("is Final -> ${reflectClass.isFinal}")
    println("is Inner -> ${reflectClass.isInner}")
    println("is Value -> ${reflectClass.isValue}")
    println("is Data -> ${reflectClass.isData}")
    println("is Open -> ${reflectClass.isOpen}")
    println("is Abstract -> ${reflectClass.isAbstract}")
    println("is Companion -> ${reflectClass.isCompanion}")
    println("is Sealed -> ${reflectClass.isSealed}\n")
    println("Super classes -> ${reflectClass.superclasses}")
    reflectClass.superclasses.forEach {
        println("superclass -> ${it.simpleName} - is interface: ${it.java.isInterface}")
    }
    println("")
    reflectClass.constructors.forEach {
        println("Constructor -> $it: ${it.returnType}")

        it.parameters.forEach { param ->
            println("Parameter -> ${param.name}: ${param.type}")
        }
    }
    println("")
    reflectClass.members.forEach {

        val visibility = if (it.visibility == KVisibility.PUBLIC) {
            "public"
        } else {
            "not public"
        }

        println("Member - $visibility (${it.name}): ${it.returnType} \n")
    }
    println("")
    println("|-------------- ${reflectClass.simpleName} --------------|")
}