package characters

open class Enemy(name: String,
                 hp: Int = 0,
                 element: String = "Неизвестный") : GameCharacter(name, hp, element ){
    fun takeDamage(amount: Int) {
        println("$name получает $amount урона")
        hp -= amount
        if (hp < 0) hp = 0
        println("Осталось HP врага: $hp")
    }
    fun isStrong(): Boolean {
        return hp>100
    }
    fun getThreatLevel(): String {
        if (hp<0) {
            return "Некорректное здоровье"
        }
        return when (hp){
            in 0..50 -> "Низкий"
            in 51..150 -> "Средний"
            else -> "Высокий"
        }
    }
}