package transport

class Teleport(name: String): Transport(name, 99999, 3) {
    override fun move() {
        println("$name мгновенно перемещается в другое место")
    }
    override fun specialAbility() {
        println("Для $name нужна мана для активации, мгновенное перемещение")
    }
}