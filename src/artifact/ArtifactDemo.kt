package artifact

fun main() {
    val weapon = Weapon(
        "Пламенный меч",
        damageType = "огненный",
        isTwoHanded = true)
    val potion = Potion(
        name = "Зелье Исцеления",
        effectDuration = 10,
        isConsumable = true
    )
    val relic = Relic(
        name = "Эльфийский Талисман",
        origin = "эльфийское",
        charges = 3
    )
    val artifacts: List<MagicItem> = listOf(weapon, potion, relic)
    for (item in artifacts) {
        item.describe()
        val result = item.use()
        println(result)
        println()
    }
}