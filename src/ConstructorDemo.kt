class Runoob(name: String) {

    var url = "http://www.shnu.edu.cn"
    var country = "CN"
    var siteName = name

    init {
        println("��ʼ����վ���� $name")
    }

    fun printTest() {
        println("������ĺ���")
    }
}

fun main(args: Array<String>) {
    var runoob = Runoob("�Ϻ�ʦ����ѧ")

    println(runoob.siteName)
    println(runoob.url)
    println(runoob.country)

    runoob.printTest()
}