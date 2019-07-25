package kotlinIn

import lessEnum.Color

fun main(args: Array<String>) {
    val oleg = Person1("Oleg", false)
    oleg.isMarried = true
    println(oleg.isMarried)

    val req = Rectangle(34, 3)
    println(req.line)

    println(Color.BLUE.rgb())

    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}