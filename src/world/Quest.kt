package world

class Quest(title: String, reward: Int,val duration: Int,val difficulty: String): Mission(reward, title) {
//    fun printInfo() {
//        println("Название квеста: ${this.title}\n Время выполнения: ${this.duration}\n Награда: ${this.reward}\n золотых Уровень сложности: ${this.difficulty}")
//    }

    override fun describe() {
        println("Квест $title на $duration часов, сложность: $difficulty, награда: $reward золотых")
    }
    fun isHard(): Boolean {
        return difficulty.lowercase() == "сложный"
    }
    fun goldPerHour(): Int {
        require(duration>=0 && reward>=0) {
            "Длительность и награда не могут быть отрицательными!"
        }
        if (duration == 0) return 0
        return reward / duration
    }
}