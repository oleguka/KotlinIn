package kotlinIn.Companion

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

