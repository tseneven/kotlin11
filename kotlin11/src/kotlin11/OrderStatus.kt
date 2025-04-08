package kotlin11

enum class OrderStatus(val description: String) {
    PLACED("Заказ размещён"),
    PROCESSING("В обработке"),
    SHIPPED("Отправлен"),
    DELIVERED("Доставлен");

    fun isFinal(): Boolean = this == DELIVERED
    fun isInTransit(): Boolean = this == SHIPPED
    fun getRussianName(): String = description
    fun printInfo() = println("Статус: $name (${getRussianName()}), позиция: $ordinal, финальный: ${isFinal()}")
}