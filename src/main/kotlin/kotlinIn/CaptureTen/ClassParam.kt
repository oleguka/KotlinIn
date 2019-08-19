package kotlinIn.CaptureTen

import ru.yole.jkid.DeserializeInterface

interface Company {
    val name: String
}

data class CompanyImpl(override val name: String) : Company

data class Person1(val name: String,
                   @DeserializeInterface(CompanyImpl::class) val company: Company)