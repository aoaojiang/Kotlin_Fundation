fun main(args: Array<String>) {

    fun forceChoke() {
        println("函数forceChoke()输出。")
    }

    forceChoke()

    fun makeAnEntrance(line: String) {
        println(line)
    }

    makeAnEntrance("传递一个字符串给makeAnEntrance().")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int {
        val goodGuys = rebels + ewoks
        return goodGuys
    }

    val rebels = calculateNumberGoodGuys(5, 7)
    println("Darth Vader faced off against $rebels rebel scum.")
    println("Darth Vader faced off against ${calculateNumberGoodGuys(5, 7)} rebel scum.")

    fun vaderIsFeeling(mood: String = "angry") {
        println(mood)
    }

    vaderIsFeeling()
    vaderIsFeeling("meh")
}