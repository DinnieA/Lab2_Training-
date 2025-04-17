fun main() {
    print("Введіть ціле число: ")
    val input = readLine()

    try {
        val number = input?.toInt()  // Пробуємо перетворити рядок у ціле число
        println("Ви ввели число: $number")
    } catch (e: NumberFormatException) {
        println("Помилка: ви ввели некоректне число.")
    }
}
