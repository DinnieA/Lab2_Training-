fun main() {
    print("Введіть кількість чисел: ")
    val n = readLine()?.toIntOrNull() ?: return

    val numbers = mutableListOf<Int>()

    // Зчитування n чисел
    for (i in 1..n) {
        print("Введіть число $i: ")
        val number = readLine()?.toIntOrNull() ?: 0
        numbers.add(number)
    }

    // Вивід у зворотному порядку
    println("Числа у зворотному порядку:")
    for (i in numbers.size - 1 downTo 0) {
        println(numbers[i])
    }
}
