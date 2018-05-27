package my.demo

//当某个变量的值可以为null的时候，必须在声明处的类型后添加 ? 来标识该引用可为空

fun pareInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = pareInt(arg1)
    val y = pareInt(arg2)

    if (x != null && y != null)
        println(x * y)
    else
        println("$arg1 或者 $arg2 不是数字")
}

fun main(args: Array<String>) {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")
}