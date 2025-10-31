package magic

import magic.Spell

fun main() {
    val firewall = Spell("Огненная стена", 3, 3, "\uD83D\uDD25")
    firewall.cast()
    val iceSheet = Spell("Ледяной щит", 4, "\u2744\uFE0F")
    val heal = InstantSpell("Лечение", "\uD83D\uDC9A", 5)
//    iceSheet.cast()
//    val spell = Spell()
//    spell.cast()
//    println(firewall.area())
//    println(iceSheet.area())
//    println(spell.area())
    println("Заклинание: ${firewall.name}")
    println("Символ: ${firewall.symbol}")
    println("Длится: ${firewall.duration} сек")

    println("\n Мгновенное Заклинание: ${heal.name}")
    println("Символ: ${heal.symbol}")
    println("Сила: ${heal.power}")
    println("Длится: ${heal.duration} сек")

}