package kotlinIn.Capture9

import java.util.*
import javax.xml.ws.Service

inline fun <reified T> isA(value: Any) = value is T

//fun <T> isB(value: Any) = value is T

fun main() {
    println(isA<String>("abc"))

    val serviceImpl = loadService<Service>()
}

inline fun <reified T> loadService(): ServiceLoader<T>? {
    return ServiceLoader.load(T::class.java)
}

interface Producer<out T> {
    fun produce(): T
}