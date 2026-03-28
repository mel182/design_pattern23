package factoryPattern.models

class RocketEnemyShip: EnemyShip() {

    init {
        setName(name = "Rocket Enemy Ship")
        setAtmDamage(atmDamage = 10.0)
    }

}