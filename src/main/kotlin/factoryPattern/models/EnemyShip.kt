package factoryPattern.models

abstract class EnemyShip {

    var name: String = ""
        private set

    var atmDamage: Double = 0.0
        private set

    fun setName(name: String) {
        this.name = name
    }

    fun setAtmDamage(atmDamage: Double) {
        this.atmDamage = atmDamage
    }

    fun followHeroShip() {
        println("$name is following the hero")
    }

    fun displayEnemyShip() {
        println("$name is on the screen")
    }

    fun enemyShipShoots() {
        println("$name attack and does $atmDamage")
    }
}