package my.demo

fun maxOf1(a: Int, b: Int) = if (a > b) a else b

fun main(args: Array<String>) {
    println("max of 0 and 42 is ${maxOf1(0, 42)}")
}