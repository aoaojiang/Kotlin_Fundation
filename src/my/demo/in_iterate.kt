package my.demo

fun main(args: Array<String>) {

    for (x in 1..5)
        print(x)

    println()

    for (x in 1..10 step 2)
        print(x)

    println()

    for (x in 9 downTo 0 step 3)
        print(x)
}