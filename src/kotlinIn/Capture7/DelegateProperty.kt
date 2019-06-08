package kotlinIn.Capture7

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.reflect.KProperty

class Person5(val name: String, age: Int, salary: Int) : PropertyChangeAware() {

    var age: Int by ObservableProperty(age, changeSupport)
    var salary: Int by ObservableProperty(salary, changeSupport)

}

open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

class ObservableProperty(var propValue: Int, val changeSupport: PropertyChangeSupport) {
    operator fun getValue(p: Person5, prop: KProperty<*>): Int = propValue

    operator fun setValue(p: Person5, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}

fun main() {
    val p = Person5("Dmitry", 34, 2000)
    p.addPropertyChangeListener(
        PropertyChangeListener { event -> println("Property ${event.propertyName} changed from ${event.oldValue} to ${event.newValue}") }
    )

    p.age = 35
    p.salary = 2100
}