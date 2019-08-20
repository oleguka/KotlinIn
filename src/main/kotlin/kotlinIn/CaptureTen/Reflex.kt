package kotlinIn.CaptureTen

import kotlin.reflect.KFunction

class Redlex(val name: String, val age: Int)


fun main() {

//    fun foo(x: Int) = println(x)
//    val kFunction = ::foo
//    kFunction.call(42)

//    fun sum(x: Int, y: Int) = x + y
//
//    val kFunction: KFunction2<Int, Int, Int> = ::sum
//    println(kFunction.invoke(1, 2) + kFunction(3, 4))
//
//    var counter = 0
//    val kProperty = ::counter
//    kProperty.setter.call(21)
//    println(kProperty.get())

    val oleg = Redlex("Oleg", 22)
    val memberProp = Redlex::age
    println(memberProp.get(oleg))


    fun isOdd(x: Int) = x % 2 != 0
    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd))
}

