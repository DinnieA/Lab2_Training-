fun main() {
    print("Введіть ціле число: ")
    val input = readLine()

    // Перевірка, чи введене значення є цілим числом
    val number = input?.toIntOrNull()
    if (number == null) {
        println("Некоректне число!")
        return
    }

    // Перевірка на парність
    if (number % 2 == 0) {
        println("$number — парне число")
    } else {
        println("$number — непарне число")
    }
}
