package transport

class Horse(name: String): Transport(name = name, speed = 60, capacity = 1) {
    override fun move() {
        println("$name скачет по равнинам")
    }
    override fun specialAbility() {
        println("$name может ускориться в бою")
    }
}