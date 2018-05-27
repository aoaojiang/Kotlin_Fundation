package my.demo

fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0

    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}