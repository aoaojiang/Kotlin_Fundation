package my.demo

//使用 in 运算符来检测某个数字是否在指定区间内

fun main(args: Array<String>) {
    val x = 10
    val y = 9

    if (x in 1..y + 1)
        println("在区间内")
}