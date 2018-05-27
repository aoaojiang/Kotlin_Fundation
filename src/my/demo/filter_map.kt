package my.demo

fun main(args: Array<String>) {
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")

    fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}