package kotlinIn.Companion

class Person (val name: String) {
    companion object : JSONFactory<Person> {
        override fun fromJSON(jsonText: String): Person = Person("oleg")
    }
}

