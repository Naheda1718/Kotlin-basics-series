
// Simple inheritance example

//open class Animal{
//    fun eat(){
//        println("Animal is eating")
//    }
//}
//
//class Dog : Animal(){
//    fun bark(){
//        println("Dog is barking")
//    }
//}
//
//fun main(){
//    val dog = Dog()
//    dog.eat()
//    dog.bark()
//}


// Inheritance with constructor and init block example


open class Vehicle(val brand:String){
    init {
        println("Vehicle init block : brand is $brand")
    }

    fun start(){
        println("$brand Is starting")
    }
}

class Car(brand: String, val color: String):Vehicle(brand){
    init {
        println("car init block : color is $color")
    }

    fun displayinfo(){
        println("Car brand : $brand, color: $color")
    }

}

fun main(){
    val car= Car("Toyota","Red")
    car.start()
    car.displayinfo()

}