package world

class Quest(
    title: String,
    reward: Int,
    val duration: Int,
    val difficulty: String,
    val questType: QuestType
): Mission(reward, title) {
    fun printInfo() {
        println("Название квеста: ${this.title}\n Время выполнения: ${this.duration}\n Награда: ${this.reward}\n золотых Уровень сложности: ${this.difficulty}, тип квеста: ${questType.description}")
    }
    override fun describe() {
        println("Квест $title на $duration часов, сложность: $difficulty, награда: $reward золотых, тип квеста: ${questType.description}")
    }
    fun isHard(): Boolean {
        return difficulty.lowercase() == "сложный"
    }
    fun goldPerHour(): Int {
        require(duration >= 0 && reward >= 0) {
            "Длительность и награда не могут быть отрицательными!"
        }
        if (duration == 0) return 0
        return reward / duration
    }
    fun printExploreQuests(quests: List<Quest>) {
        for (q in quests) {
            if (q.questType == QuestType.EXPLORE) {
                q.describe()
            }
        }
    }
}