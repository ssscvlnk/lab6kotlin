package artifact

class Relic(name: String,
            val origin: String,
            var charges: Int): MagicItem(name, 60, "Rare") {
    override fun describe() {
        super.describe()
        println("Происхождение: $origin, заряды: $charges")
    }
    override fun use(): String {
        return if (charges > 0) {
            charges -= 1
            "$name активирована (осталось зарядов: $charges)"
        } else {
            "$name не имеет зарядов"
        }
    }
}