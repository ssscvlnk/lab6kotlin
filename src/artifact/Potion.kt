package artifact

class Potion(name: String,
             val effectDuration: Int,
             val isConsumable: Boolean): MagicItem(name, 40, "Common") {
    var consumed: Boolean = false
    override fun describe() {
        super.describe()
        println("Длительность эффекта: ${effectDuration} сек, ${if (isConsumable) "Одноразовое" else "Многоразовое"}")
    }
    override fun use(): String {
        if (isConsumable) {
            return if (!consumed) {
                consumed = true
                "$name выпито: эффект +$power на $effectDuration сек. Зелье использовано (одноразовое)"
            } else {
                "$name уже использовано — зелье пусто"
            }
        } else {
            return "$name активировано: эффект +$power на $effectDuration секунд (многоразовое)"
        }
    }
}