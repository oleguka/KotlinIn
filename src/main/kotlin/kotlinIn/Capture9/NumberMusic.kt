package kotlinIn.Capture9

fun main() {
    val music: Music<Rock> = Rock(9, "ABBA")

    val folkmusic = FolkRock(3, "Lumsk")

    println(music.play().name)
    println(folkmusic.number)

}