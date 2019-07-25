package kotlinIn

import lessEnum.Color
import lessEnum.Color.*

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
    println(getWarmth(Color.YELLOW))
    println(mix(YELLOW, RED))
    println(mixOptimized(BLUE, VIOLET))
}

fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Каждый"
            Color.ORANGE -> "Охотник"
            Color.YELLOW -> "Желает"
            Color.GREEN -> "Знать"
            Color.BLUE -> "Где"
            Color.INDIGO -> "Сидит"
            Color.VIOLET -> "Фазан"
        }

fun getWarmth(color: Color) = when(color) {
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "холодный"
    Color.RED, Color.ORANGE, Color.YELLOW -> "теплый"
    Color.GREEN -> "нейтральный"
}

fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(BLUE, VIOLET) -> INDIGO
    else -> throw Exception("Грязный цвет")
}

fun mixOptimized(c1: Color, c2: Color) =
        when {
            (c1 == RED && c2 == YELLOW) ||
                    (c1 == YELLOW && c2 == RED) -> ORANGE
            (c1 == YELLOW && c2 == BLUE) ||
                    (c1 == BLUE && c2 == YELLOW) -> GREEN
            (c1 == BLUE && c2 == VIOLET) ||
                    (c1 == VIOLET && c2 == BLUE) -> INDIGO
            else -> throw Exception("Dirty color")
        }