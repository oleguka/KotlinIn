package kotlinIn.Capture7

class Email {/*...*/}
fun loadEmails(person: Person4): List<Email> {
    println("Load emails for ${person.name}")
    return listOf(/*...*/)
}


//class Person3(val name: String) {
//    private var _emails: List<Email>? = null
//
//    val emails: List<Email>
//    get() {
//        if (_emails == null) {
//            _emails = loadEmails(this)
//        }
//        return _emails!!
//    }
//}

fun main() {
    val p = Person4("Alice")
    p.emails
    p.emails
}

class Person4(val name: String) {
    val emails by lazy { loadEmails(this) }
}