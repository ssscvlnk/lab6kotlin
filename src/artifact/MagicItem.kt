package artifact

open class MagicItem(
    val name: String,
    val power: Int,
    val rarity: String
) {
    open fun describe() {
        println("Название артефакта: $name, сила: $power, редкость: $rarity")
    }
    open fun use(): String {
        return "Нет эффекта применения"
    }
}