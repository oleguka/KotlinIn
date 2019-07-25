package kotlinIn.capture3.`3`

class Number1(val number: Int, val userId: Int)

fun main(args: Array<String>) {
    val oleg = Number1(8,0)
    oleg.validate()
}

fun numberPhone(number: Int, userId: Int) {
    if (number == 0) {
        println("Save number $number to base")
    }
    if (userId == 0) {
        throw IllegalArgumentException("name = null")
    }
}

fun Number1.validate() {
    fun validate(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("Can't save $value")
        }
        else {
            println("save $value")
        }
    }
    validate(number)
    validate(userId)
}