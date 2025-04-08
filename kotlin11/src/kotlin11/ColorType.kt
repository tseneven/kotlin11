package kotlin11

enum class ColorType(val rgb: String) {
    RED("0xFF0000"),
    GREEN("0x00FF00"),
    BLUE("0x0000FF"),
    YELLOW("0xFFFF00");

    fun isWarm(): Boolean = this == RED || this == YELLOW
    fun isCool(): Boolean = this == BLUE || this == GREEN
    fun getRussianName(): String = when (this) {
        RED -> "Красный"
        GREEN -> "Зелёный"
        BLUE -> "Синий"
        YELLOW -> "Жёлтый"
    }
    fun printInfo() = println("Цвет: ${getRussianName()}, RGB: $rgb, тёплый: ${isWarm()}")
}
