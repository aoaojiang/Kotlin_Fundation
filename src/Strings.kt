fun main(args: Array<String>) {
    val str = "May the force be with you."
    println(str)

    val rawCrawl = """ >A long time ago,
        >in a galaxy
        >far, far, away...
        >Bumm Bumm Bummmm...""".trimMargin(">")
    println(rawCrawl)

//    for (c in str) {
//        println(c)
//    }

    val contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)

    val contains = str.contains("Force", false)
    println(contains)

    val uppercase = str.toUpperCase()
    val lowercase = str.toLowerCase()

    println(uppercase)
    println(lowercase)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4, 13)
    println(subsequence)

    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27
    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle is $age years old.")
    println("Lukes full name $luke has ${luke.length} characters.")
}