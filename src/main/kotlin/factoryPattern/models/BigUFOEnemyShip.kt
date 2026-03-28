package factoryPattern.models

class BigUFOEnemyShip: UFOEnemyShip() {

    init {
        setName(name = "Big UFO Enemy Ship")
        setAtmDamage(atmDamage = 40.0)
    }

}