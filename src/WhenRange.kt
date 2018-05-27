fun main(args: Array<String>) {
    val items = setOf("apple", "banana", "kiwi")

    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}