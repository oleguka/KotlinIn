package kotlinIn

class Rectangle(val height: Int, val wight: Int) {
    val isSquare: Boolean
    get() = height == wight

    val line = if (isSquare) 5 else 9

}