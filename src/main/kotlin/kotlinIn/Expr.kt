package kotlinIn

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int = when(e) {
    is Num -> e.value
    is Sum -> eval(e.left) + eval(e.right)
    else -> throw IllegalArgumentException("Unknown expression")
}

fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum: $left + $right")
                left + right
            }
            else -> throw java.lang.IllegalArgumentException("Unknown expression")
        }