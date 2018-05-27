fun main(args: Array<String>) {

    val printMessage = { message: String -> println(message) }

    printMessage("Hello world!")

    val sumA = { x: Int, y: Int -> x + y }
    println(sumA(5, 4))

    val sumB: (Int, Int) -> Int = { x, y -> x + y }
    println(sumB(9, 3))

    fun downloadData(url: String, completion: () -> Unit) {
        // sent a download request
        // we got back data
        // there were no network errors
        completion()
    }

    // call downloadData function
    downloadData("fakeUrl.com", {
        println("The code in this block, will only run" +
                " after the completion().")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        // send a download request
        // wo got back car data
        val car = Car("Tesla", "ModelX", "Blue")
        completion(car)
    }

    downloadCarData("fakeUrl.com", {
        println(it.color)
        println(it.make)
    })

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        val webRequestSuccess = false
        if (webRequestSuccess) {
            val truck = Truck("Ford", "F-150", 20)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeUrl.com") { truck, success ->
        if (success == true) {
            truck?.tow()
        } else {
            println("Something went wrong!")
        }
    }
}