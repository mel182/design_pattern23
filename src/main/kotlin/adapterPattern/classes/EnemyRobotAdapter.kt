package adapterPattern.classes

import adapterPattern.interfaces.EnemyAttacker

/**
 * This is the ememy robot adapter class
 */
class EnemyRobotAdapter(private val enemyRobot:EnemyRobot) : EnemyAttacker {

    override fun fireWeapon() {
        enemyRobot.smashWithHands()
    }

    override fun driveForward() {
        enemyRobot.walkForward()
    }

    override fun assignDriver(driver: String) {
        enemyRobot.reactToHuman(driver)
    }
}