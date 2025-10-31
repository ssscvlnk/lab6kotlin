package world

open class Mission(val reward: Int, val title: String) {
    open fun describe() {
        println("Миссия: $title, Награда: $reward монет")
    }
    fun isHighReward(): Boolean {
        return reward>1000
    }
}