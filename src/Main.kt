import java.math.BigDecimal

private val Int.bd: BigDecimal
    get() {
        return BigDecimal(this)
    }

data class Money(val amount: BigDecimal, val currency: String)

fun sendPayment(money: Money, message: String = "") {
    println("Sending ${money.amount}")
}

fun sum(x: Int, y: Int) = x + y

fun convertToDollars(money: Money) = when (money.currency) {
        "$" -> money
        "EUR" -> Money(money.amount * BigDecimal(1.10), "$")
        else -> throw IllegalArgumentException("not the currency you're interested in!")
}

fun BigDecimal.percent(percentage: Int) = this.multiply(BigDecimal(percentage)).divide(BigDecimal(1000))

infix fun Int.percentOf(money: Money) = money.amount.multiply(BigDecimal(this)).divide(BigDecimal(100))

fun main(args: Array<String>) {

    val tickets = Money(BigDecimal(100), "$")
    val popcorn = tickets.copy(100.bd, "$")
    val machine = Money(BigDecimal(44), "EUR")

    println(convertToDollars(machine))


    var train : Money = Money(100.bd, "$")


    val bd1 = BigDecimal(100)
    val bd2 = 100.bd

    bd1.percent(7)

    7 percentOf popcorn

    sendPayment(money = tickets, message = "Good luck!")

    if (tickets != popcorn) {
        println("They are different")
    }

}

