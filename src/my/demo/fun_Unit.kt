package my.demo

//Unit返回类型可以省略
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun main(args: Array<String>) {
    printSum(-1, 8)
}