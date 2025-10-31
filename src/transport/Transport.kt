package transport

open class Transport (
    val name: String,
    val speed: Int,
    val capacity: Int
){
    open fun describe() {
        println("Название транспорта: $name, скорость: $speed, сколько персонажей можно перевозить: $capacity")
    }
    open fun move() {
        println("$name движется...")
    }
    open fun specialAbility() {
        println("Особые способности отсутствуют")
    }
}