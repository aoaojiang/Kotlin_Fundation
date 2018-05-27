package my.demo

abstract class Shape(val sides: List<Double>) {
    val perimeter: Double get() = sides.sum()
    abstract fun calculateArea(): Double
}

interface RectangleProperties {
    val isSquare: Boolean
}

class Rectangle(
        var height: Double,
        var length: Double
) : Shape(listOf(height, length, height, length)), RectangleProperties {
    override fun calculateArea(): Double = height * length

    override val isSquare: Boolean
        get() = height == length
}

class Triangle(
        var a: Double,
        var b: Double,
        var c: Double
) : Shape(listOf(a, b, c)) {
    override fun calculateArea(): Double {
        val d = perimeter / 2

        return Math.sqrt(d * (d - a) * (d - b) * (d - c))
    }
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(5.0, 2.0)
    val triangle = Triangle(3.0, 4.0, 5.0)

    println("矩形面积 = ${rectangle.calculateArea()}, 周长 = ${rectangle.perimeter}")
    println("三角形面积 = ${triangle.calculateArea()}, 周长 = ${triangle.perimeter}")
}