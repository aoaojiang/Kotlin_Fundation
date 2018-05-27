class Runoob(name: String) {

    var url = "http://www.shnu.edu.cn"
    var country = "CN"
    var siteName = name

    init {
        println("初始化网站名： $name")
    }

    fun printTest() {
        println("我是类的函数")
    }
}

fun main(args: Array<String>) {
    var runoob = Runoob("上海师范大学")

    println(runoob.siteName)
    println(runoob.url)
    println(runoob.country)

    runoob.printTest()
}