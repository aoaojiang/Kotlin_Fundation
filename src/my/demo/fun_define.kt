package my.demo

//sampleStart
fun sum(a: Int, b: Int): Int {
    return a + b
}
//sampleEnd

fun main(args: Array<String>) {
    print("3 + 5 = ")
    println(sum(3, 5))
}