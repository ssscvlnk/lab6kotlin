package characters

import world.Quest

class Hero(
    name: String,
    var gender: String = "",
    var role: String = "",
    hp: Int = 100,
    var mp: Int = 0,
    var level: Int = 1,
    element: String = ""
) : GameCharacter(name, hp, element ){
    fun sayHello() {
        println("Я - $name, мой путь только начинается!")
    }
    fun showStats() {
        println("Имя: $name | Класс: $role | HP: $hp | Mp: $mp | Уровень: $level | Element: $element")
    }
    fun meditate() {
        println("$name медитирует")
        mp += 20
        println("Мана восстановлена! Текущая мана: $mp")
    }
    fun takeDamage(amount: Int) {
        println("$name получает урон!")
        hp -= amount
        println("Осталось здоровья: $hp")
        if (hp <= 0) {
            die()
            return
        }
    }
    fun castSpell() {
        println("$name применяет магию!")
        if (mp >0) {
            mp-=10
            println("$name применяет магию! Осталось: $mp")
        } else {
            println("Недостаточно маны! Осталось: 0")
        }
    }
    fun heal() {
        if (mp<10) {
            println("Недостаточно маны! Осталось: $mp")
            return
        }
        mp -= 10
        hp += 10
        println("Лечусь! Восстановлено здоровье, потрачено 10 маны")
        println("Здоровье: $hp | Мана: $mp")
    }
    fun greet(name: String) {
        println("Hello, $name!")
    }
    fun die() {
        println("Герой умер")
    }
    fun attack(enemy: Enemy, damage: Int) {
        println("$name атакует врага ${enemy.name}")
        enemy.takeDamage(damage)
    }
    fun castSpellOn(enemy: Enemy, spellName: String, damage: Int) {
        println("$name использует заклинание '$spellName' против ${enemy.name}!")
        if (element == enemy.element) {
            println("Стихии совпадают! Урон снижен.")
            val reducedDamage = damage / 2
            enemy.takeDamage(reducedDamage)
        } else {
            enemy.takeDamage(damage)
        }
        mp -= 10
        if (mp < 0) mp = 0
        println("Осталось маны: $mp")
    }
    fun duel(opponent: Hero) {
        println("Дуэль между $name и ${opponent.name} начинается!")
        println("$name атакует первым!")
        opponent.takeDamage(15)
        println("${opponent.name} отвечает!")
        this.takeDamage(15)
        println("Дуэль завершена.")
        println("Состояние героев:")
        this.showStats()
        opponent.showStats()
    }
    fun isAlive(): Boolean {
        return hp>0
    }
    fun canAcceptQuest(quest: Quest): Boolean {
        val canAccept = when (quest.difficulty.lowercase()) {
            "легкий" -> level >=1
            "средний" -> level >=3
            "сложный" -> level >=5
            else -> false
        }
        if (canAccept) {
            println("$name может принять квест '${quest.title}'!")
        } else {
            println("$name не может принять квест '${quest.title}'. Требуется более высокий уровень.")
        }
        return canAccept
    }
}