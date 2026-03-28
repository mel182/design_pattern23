package factoryPattern.factory

import factoryPattern.models.BigUFOEnemyShip
import factoryPattern.models.EnemyShip
import factoryPattern.models.RocketEnemyShip
import factoryPattern.models.UFOEnemyShip

class EnemyShipFactory {

    fun makeEnemyShip(newShipType: String): EnemyShip? {

        return when {

            newShipType.equals("U",ignoreCase = true) -> {
                UFOEnemyShip()
            }

            newShipType.equals("R",ignoreCase = true) -> {
                RocketEnemyShip()
            }

            newShipType.equals("B",ignoreCase = true) -> {
                BigUFOEnemyShip()
            }

            else -> null
        }
    }

}