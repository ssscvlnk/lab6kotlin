package artifact

class Weapon(name: String,
             val damageType: String,
             val isTwoHanded: Boolean): MagicItem(name, 85, "Epic") {
    override fun describe() {
        super.describe()
        println("Тип урона: $damageType, ${if (isTwoHanded) "Двуручное" else "Одноручное"}")
    }
    override fun use(): String {
        return "Наносит $damageType урон силой $power"
    }
}