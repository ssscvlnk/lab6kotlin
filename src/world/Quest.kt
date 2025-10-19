package world

class Quest(val title: String, val duration: Int, val reward: Int, val difficulty: String) {
    fun printInfo() {
        println("Название квеста: ${this.title}\n Время выполнения: ${this.duration}\n Награда: ${this.reward}\n золотых Уровень сложности: ${this.difficulty}")
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