fun main(array: Array<String>) {
    var x = 0

    if (x > 0) {
        println("x ���� 0")
    } else if (x == 0) {
        println("x ���� 0")
    } else {
        println("x С�� 0")
    }

    var a = 1
    var b = 2
    val c = if (a >= b) a else b

    println("c ��ֵΪ $c")

    val max = if (a > b) {
        println("max = $a")
        a
    } else {
        println("max = $b")
        b
    }
}