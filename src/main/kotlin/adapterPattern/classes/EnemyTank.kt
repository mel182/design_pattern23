package adapterPattern.classes

import adapterPattern.interfaces.EnemyAttacker
import kotlin.random.Random

/**
 * This is the enemy attacker class
 */
class EnemyTank : EnemyAttacker {

    val generator = Random

    override fun fireWeapon() {
        val attackDamage = generator.nextInt(10) + 1
        println("Enemy Tank does $attackDamage Damage")
    }

    override fun driveForward() {
        val movement = generator.nextInt(5)+1
        println("Enemy Tank moves $movement spaces")
    }

    override fun assignDriver(driver: String) {
        println("$driver is driving the tank")
    }
}