package kotlinIn.CaptureTen

import ru.yole.jkid.DeserializeInterface
import ru.yole.jkid.serialization.serialize
import kotlin.reflect.KClass

interface Company {
    val name: String
}

data class CompanyImpl(override val name: String) : Company

data class Person1(val name: String,
                   @DeserializeInterface(CompanyImpl::class) val company: Company)

//annotation class DeserializeInterface(val targetClass: KClass<out Any>)

fun main() {
    val naumen = CompanyImpl("Naumen")
    val oleg = Person1("oleg", naumen)

    println(serialize(oleg))
}