package transport

class Dragon(name: String): Transport(name, 120, 2) {
    override fun move() {
        println("$name летит высоко над землёй")
    }
    override fun specialAbility() {
        println("$name дышит огнём и перевозит героя по воздуху")
    }
}