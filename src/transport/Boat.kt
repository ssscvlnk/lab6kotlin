package transport

class Boat(name: String): Transport(name, 40, 4){
    override fun move() {
        println("$name плывёт по воде")
    }
    override fun specialAbility() {
        println("$name может перевозить группу по рекам и озёрам")
    }
}