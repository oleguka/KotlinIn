package CaptureFive


fun main() {

    var olege = 12

    val people = listOf(Person("Oleg", 24), Person("Ira", 25))
    println(people.maxBy {
        it.age
    })
    println(people.maxBy { p -> p.age })

    val d = people.joinToString(" ") { it.name }
    println(d)


    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }

    println(sum(1, 2))

    val errors = listOf("403 Error", "404 Error")
    printMessageWithPrefix(errors, "main:")

    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)
}

fun printMessageWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}