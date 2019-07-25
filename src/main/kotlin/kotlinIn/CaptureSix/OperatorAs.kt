package kotlinIn.CaptureSix

fun main() {
    val p1 = PersonAs("Dmitry", "Jemerov")
    val p2 = PersonAs("Dmitry", "Jemerov")


    println(p1 == p2)

    println(p1.equals(p2))

    ignoreNulls(null)
}

class PersonAs(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? PersonAs ?: return false
        return otherPerson.firstName == firstName && otherPerson.lastName == lastName
    }

    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}

fun ignoreNulls(s: String?) {
    val sNotNull: String = s !!
    println(sNotNull.length)
}