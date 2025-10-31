package world

class Contract(
    title: String,
    val clientName: String,
    val taskDescription: String,
    reward: Int,
    val isUrgent: Boolean = false
) : Mission(reward, title) {
//    fun printContractInfo() {
//        println("Заказчик: $clientName")
//        println("Задача: $taskDescription")
//        println("Награда: $reward")
//        println("Срочность: ${if (isUrgent) "Срочно!" else "Обычный контракт"}")
//    }
    override fun describe() {
        println("Контракт от: $clientName: $taskDescription (${if (isUrgent) "Срочно!" else "Обычный"}), награда: $reward")
    }
}