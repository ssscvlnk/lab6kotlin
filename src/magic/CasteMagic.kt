package magic

import magic.Spell

fun main() {
    val firewall = Spell("Огненная стена", 5, 3, "\uD83D\uDD25")
    firewall.cast()
    val iceSheet = Spell("Ледяной щит", 4, "\u2744\uFE0F")
    iceSheet.cast()
    val spell = Spell()
    spell.cast()
    println(firewall.area())
    println(iceSheet.area())
    println(spell.area())
}