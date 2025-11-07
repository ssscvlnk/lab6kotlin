package world

class Trader {
    val quests = mutableListOf<Quest>()
    fun addQuest(quest: Quest) {
        quests.add(quest)
        println("Квест '${quest.title}' добавлен")
    }
    fun showAvailableQuests() {
        if (quests.isEmpty()) {
            println("Нет доступных квестов")
        } else {
            println("=== Доступные квесты ===")
            var i = 0
            for (quest in quests) {
                println("$i - ${quest.title} (${quest.questType.description}, награда: ${quest.reward})")
                i++
            }
        }
    }
    fun giveQuest(index: Int): Quest? {
        return if (index >= 0 && index < quests.size) quests[index] else null
    }
    fun removeQuest(index: Int) {
        if (index >= 0 && index < quests.size) {
            val removed = quests.removeAt(index)
            println("Квест '${removed.title}' выдан и удалён из списка")
        } else {
            println("Некорректный индекс")
        }
    }
    fun start() {
        while (true) {
            println("Выберите действие:\n1 - Добавить квест\n2 - Показать все квесты\n3 - Взять квест\n0 - Выйти")
            print("Ваш выбор: ")
            when (readln()) {
                "1" -> {
                    print("Введите название квеста: ")
                    val title = readln()
                    print("Введите длительность (часы): ")
                    val duration = readln().toIntOrNull() ?: 0
                    print("Введите награду (золото): ")
                    val reward = readln().toIntOrNull() ?: 0
                    print("Введите сложность: ")
                    val difficulty = readln()
                    print("Введите тип квеста (DELIVERY, ELIMINATION, ESCORT, EXPLORE, BOSSFIGHT): ")
                    val typeInput = readln().uppercase()
                    val type = when (typeInput) {
                        "DELIVERY" -> QuestType.DELIVERY
                        "ELIMINATION" -> QuestType.ELIMINATION
                        "ESCORT" -> QuestType.ESCORT
                        "EXPLORE" -> QuestType.EXPLORE
                        "BOSSFIGHT" -> QuestType.BOSSFIGHT
                        else -> QuestType.EXPLORE
                    }
                    val quest = Quest(title, reward, duration, difficulty, type)
                    addQuest(quest)
                }
                "2" -> showAvailableQuests()
                "3" -> {
                    showAvailableQuests()
                    if (quests.isEmpty()) continue
                    print("Введите номер квеста, который хотите взять: ")
                    val index = readln().toIntOrNull()
                    if (index != null && index >= 0 && index < quests.size) {
                        val quest = giveQuest(index)
                        quest?.describe()
                        removeQuest(index)
                    } else {
                        println("Некорректный ввод")
                    }
                }
                "0" -> {
                    println("Вы вышли из программы")
                    return
                }
                else -> println("Некорректный выбор, попробуйте снова.")
            }
        }
    }
}
