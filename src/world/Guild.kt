package world

import world.Quest

fun main() {
    val quest = Quest("Побег из замка", 5, 700, "Сложный")
    println("Квест сложный? ${quest.isHard()}")
    val quest1 = Quest("Охота", 2, 300, "Сложный")
    println(quest1.goldPerHour())
    val quest2 = Quest("Рыбалка", 0, 500, "Легкий")
    println(quest2.goldPerHour())
}
