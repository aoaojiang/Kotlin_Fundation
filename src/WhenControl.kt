fun main(args: Array<String>) {
    var x = 0

    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x ���� 1��Ҳ���� 2")
        }
    }

    when (x) {
        in 0..10 -> println("x �ڸ����䷶Χ��")
        else -> println("x ���ڸ����䷶Χ��")
    }
}