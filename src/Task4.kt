fun main() {
    print("Введіть ваше ім'я: ")
    val name: String? = readLine()

    // Перевірка чи ім’я null або порожнє
    val displayName = if (name.isNullOrBlank()) "Anonymous" else name

    println("Привіт, $displayName")
}
