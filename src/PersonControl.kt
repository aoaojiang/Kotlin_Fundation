class Person {

    var lastname: String = "zhang"
        get() = field.toUpperCase()
        set

    var no = 100
        get() = field
        set(value) {
            if (value < 10)
                field = value
            else
                field = -1
        }

    var height: Float = 145.5f
        private set
}

fun main(args: Array<String>) {

    var person = Person()

    person.lastname = "wang"

    println("lastname: ${person.lastname}")

    person.no = 9
    println("no: ${person.no}")

    person.no = 20
    println("no: ${person.no}")
}