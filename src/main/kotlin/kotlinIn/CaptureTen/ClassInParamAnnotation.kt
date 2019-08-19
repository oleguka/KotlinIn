package kotlinIn.CaptureTen

import ru.yole.jkid.CustomSerializer
import ru.yole.jkid.ValueSerializer
import ru.yole.jkid.serialization.serialize
import java.text.SimpleDateFormat
import java.util.*

object DateSerializer : ValueSerializer<Date> {
    private val dateFormat = SimpleDateFormat("dd-mm-yyyy")

    override fun toJsonValue(value: Date): Any? =
        dateFormat.format(value)

    override fun fromJsonValue(jsonValue: Any?): Date =
        dateFormat.parse(jsonValue as String)
}

data class PersonSer(val name: String,
                     @CustomSerializer(DateSerializer::class) val birthdayDate: Date)

fun main() {
    val oleg = PersonSer("oleg", SimpleDateFormat("dd-mm-yyyy").parse("15-01-1995"))
    println(serialize(oleg))
}
