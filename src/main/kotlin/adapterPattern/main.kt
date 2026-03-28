package adapterPattern

import adapterPattern.classes.EnemyRobot
import adapterPattern.classes.EnemyRobotAdapter
import adapterPattern.classes.EnemyTank

fun main() {

    val rx7Tank = EnemyTank()
    val robot = EnemyRobot()
    val robotAdapter = EnemyRobotAdapter(robot)

    println("The Robot")
    robot.reactToHuman("Paul")
    robot.walkForward()
    robot.smashWithHands()

    println("\nThe enemy tank")
    rx7Tank.assignDriver("Frank")
    rx7Tank.driveForward()
    rx7Tank.fireWeapon()

    println("\nRobot with adapter")
    robotAdapter.assignDriver("Mark")
    robotAdapter.driveForward()
    robotAdapter.fireWeapon()

}