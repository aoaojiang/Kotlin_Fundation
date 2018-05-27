package my.demo

fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwifruit")

    for (index in items.indices)
        println("item at $index is ${items[index]}")
}