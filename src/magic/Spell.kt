package magic

class Spell (
    name: String,
    val width: Int = 0,
    val heigth: Int = 0,
    symbol: String
) : MagicEffect(name, symbol, 10) {
    constructor (name: String, size: Int, symbol: String) : this(name,size,size, symbol)
    fun cast() {
        println("Кастуем $name!")
        repeat(heigth) {
            repeat(width) {
                print(symbol)
            }
            println()
        }
    }
    fun area(): Int {
        return width * heigth
    }
    fun description(): String {
        return "Заклинание $name занимает область ${width}x${heigth} и использует символ $symbol"
    }
}