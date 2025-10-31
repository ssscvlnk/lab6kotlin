package world

import world.Quest

fun main() {
//    val quest = Quest("Побег из замка", 5, 700, "Сложный")
//    println("Квест сложный? ${quest.isHard()}")
//    val quest1 = Quest("Охота", 2, 300, "Сложный")
//    println(quest1.goldPerHour())
//    val quest2 = Quest("Рыбалка", 0, 500, "Легкий")
//    println(quest2.goldPerHour())
//    val quest = Quest("Поиск артефакта", 800, 3, "Средний")
//    val contract = Contract("Защита каравана", "Гильдия купцов", "Охрана груза", 1200)
//    val specialOp = SpecialOperation("Операция Тень", 2500, 2, true)
//    println("Информация о квесте:")
//    println("Название: ${quest.title}, Награда: ${quest.reward}")
//
//    println("\nИнформация о контракте:")
//    println("Название: ${contract.title}, Заказчик: ${contract.reward}")
//
//    println("\nИнформация о спецоперации:")
//    println("Название: ${specialOp.title}")
//    specialOp.showReward()
    val missions = listOf<Mission>(
        Quest("Охота на монстров", 600, 3, "Средний"),
        SpecialOperation("Ночной рейд", 1500, 2, true),
        Contract("Сопровождение каравана", "Гильдия Торговцев", "Доставить груз через лес",800,true)
    )
    for (mission in missions) {
        mission.describe()
        println("Высокая награда? ${if (mission.isHighReward()) "Да" else "Нет"}")
        println()
    }
}
