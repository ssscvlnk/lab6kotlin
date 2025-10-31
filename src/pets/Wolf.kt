package pets

class Wolf(name: String): Pet(name = name, speed = 100, maxHealth = 250) {
    val packSize: Int = 5
    override fun makeSound() {
        println("$name воет")
    }
    override fun describe() {
        println("Питомец: $name, Здоровье: $maxHealth, Скорость: $speed")
        println("У $name размер стаи - $packSize")
    }
}