package world

class SpecialOperation(
    title: String,
    reward: Int,
    val requiredClearance: Int,
    val isCovert: Boolean
): Mission(reward,title) {
//    fun showReward() {
//        println("Требуемый допуск: $requiredClearance")
//        println("Режим секретности: ${if (isCovert) "Совершенно секретно" else "Обычный"}")
//    }
    override fun describe() {
        println("Спецоперация $title. Уровень допуска: $requiredClearance, режим: ${if (isCovert) "Секретно" else "Открыто"}, награда: $reward")
    }
}