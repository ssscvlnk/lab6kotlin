package transport

fun main() {
    val transports: List<Transport> = listOf(
        Horse("Боевой конь"),
        Dragon("Дракон Гена"),
        Boat("Лодка путешественников"),
        Teleport("Магический портал")
    )
    for (transport in transports) {
        transport.describe()
        transport.move()
        transport.specialAbility()
        println()
    }
}