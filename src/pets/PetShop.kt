package pets

fun main() {
//    val wolf = Wolf()
//    println(wolf.packSize)
//    val pets = listOf<Any>(
//        Wolf("Фенрир"),
//        Cat("Мурзик"),
//        Eagle( "Скайвинд"),
//        Bear("Балу"),
////        "hello"
//    )
    val pets = listOf(
        Wolf("Фенрир"),
        Cat("Мурзик"),
        Eagle( "Скайвинд"),
        Bear("Балу"),
    )
    for (pet in pets) {
        pet.describe()
        pet.makeSound()
        println()
    }
}