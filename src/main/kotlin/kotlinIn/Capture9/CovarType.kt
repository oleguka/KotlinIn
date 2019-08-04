//package kotlinIn.Capture9
//
//open class Animal {
//    fun feed() {
//        println("animal feed")
//    }
//}
//
//class Herd<out T : Animal> {
//    val size: Int get() = 1
//    operator fun get(i: Int): T {
//        return Animal()
//    }
//}
//
//class Cat: Animal() {
//    fun cleanLitter() {
//        println("clean litter")
//    }
//}
//
//fun feedAll(animals: Herd<Animal>) {
//    for (i in 0 until animals.size) {
//        animals[i].feed()
//    }
//}
//
//fun takeCareOfCats(cats: Herd<Cat>) {
//    for (i in 0 until cats.size) {
//        cats[i].cleanLitter()
//        feedAll(cats)
//    }
//}

fun <T> copyData(sourse: MutableList<out T>, destination: MutableList<T>) {
    for (item in sourse) {
        destination.add(item)
    }
}