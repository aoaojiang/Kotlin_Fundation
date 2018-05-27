open class Vehicle(val make: String, val model: String)


class Car(make: String, model: String, var color: String) : Vehicle(make, model)

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model){
    fun tow(){
        println("装载……")
    }
}