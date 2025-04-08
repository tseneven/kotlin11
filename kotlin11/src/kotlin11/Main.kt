package kotlin11

fun main() {
    // Дни недели
    for (day in DaysOfWeek.values()) {
        day.printInfo()
    }

    println()

    // Цвета
    for (color in ColorType.values()) {
        color.printInfo()
    }

    println()

    // Статусы заказа
    for (status in OrderStatus.values()) {
        status.printInfo()
    }
}
