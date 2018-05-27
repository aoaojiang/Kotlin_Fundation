package my.demo

//��ĳ��������ֵ����Ϊnull��ʱ�򣬱����������������ͺ���� ? ����ʶ�����ÿ�Ϊ��

fun pareInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = pareInt(arg1)
    val y = pareInt(arg2)

    if (x != null && y != null)
        println(x * y)
    else
        println("$arg1 ���� $arg2 ��������")
}

fun main(args: Array<String>) {
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")
}