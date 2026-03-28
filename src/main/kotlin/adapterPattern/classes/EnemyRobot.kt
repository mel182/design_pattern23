package adapterPattern.classes

import kotlin.random.Random

/**
 * This is the enemy robot entity (adaptee)
 */
class EnemyRobot {

    val generator = Random

    fun smashWithHands(){
        val attackDamage = generator.nextInt(10)+1
        println("Enemy robot causes $attackDamage Damage with Its hands")
    }

    fun walkForward(){
        val movement = generator.nextInt(5) + 1
        println("Enemy robot walks forward $movement spaces")
    }

    fun reactToHuman(driver:String){
        println("Enemy Ribot Tramps on $driver ")
    }


}