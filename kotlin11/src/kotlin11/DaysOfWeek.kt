package kotlin11

enum class DaysOfWeek(val dayNumber: Int) {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    fun isWeekend(): Boolean = this == SATURDAY || this == SUNDAY
    fun isWeekday(): Boolean = !isWeekend()
    fun getName(): String = when (this) {
        MONDAY -> "Понедельник"
        TUESDAY -> "Вторник"
        WEDNESDAY -> "Среда"
        THURSDAY -> "Четверг"
        FRIDAY -> "Пятница"
        SATURDAY -> "Суббота"
        SUNDAY -> "Воскресенье"
    }
    fun printInfo() = println("День: ${getName()}, номер: $dayNumber, выходной: ${isWeekend()}")
}