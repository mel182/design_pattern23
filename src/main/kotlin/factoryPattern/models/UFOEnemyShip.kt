package factoryPattern.models

open class UFOEnemyShip: EnemyShip() {

    init {
        setName(name = "UFO Enemy Ship")
        setAtmDamage(atmDamage = 20.0)
    }

}