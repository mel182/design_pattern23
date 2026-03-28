package adapterPattern.interfaces

/**
 * This is the target which is the [EnemyAttacker] interface
 */
interface EnemyAttacker {

    fun fireWeapon()
    fun driveForward()
    fun assignDriver(driver:String)
}