package world
import world.Quest

fun main() {
    //homework8 1
    val quest1 = Quest("Доставка зелья", 100, 2, "Лёгкий", QuestType.DELIVERY)
    val quest2 = Quest("Охота на волков", 250, 4, "Средний", QuestType.ELIMINATION)
    val quest3 = Quest("Сопровождение торговца", 300, 5, "Средний", QuestType.ESCORT)
    val quest4 = Quest("Исследование руин", 400, 6, "Сложный", QuestType.EXPLORE)
    val quest5 = Quest("Битва с драконом", 1000, 10, "Сложный", QuestType.BOSSFIGHT)
    val quest6 = Quest("Разведка нового континента", 600, 8, "Сложный", QuestType.EXPLORE)
    val quests = listOf(quest1, quest2, quest3, quest4, quest5, quest6)
    println("Информация обо всех квестах:")
    for (q in quests) {
        q.describe()
        q.printInfo()
        println()
    }
    println("Только квесты типа EXPLORE:")
    quest1.printExploreQuests(quests)
    //2
    val trader = Trader()
    trader.start()
//    val escortQuest = Quest("Сопровождение торговца",
//        120,
//        4,
//        "Легкий",
//        QuestType.ESCORT
//    )
//    escortQuest.printInfo()
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
//    val missions = listOf<Mission>(
//        Quest("Охота на монстров", 600, 3, "Средний"),
//        SpecialOperation("Ночной рейд", 1500, 2, true),
//        Contract("Сопровождение каравана", "Гильдия Торговцев", "Доставить груз через лес",800,true)
//    )
//    for (mission in missions) {
//        mission.describe()
//        println("Высокая награда? ${if (mission.isHighReward()) "Да" else "Нет"}")
//        println()
//    }
}
