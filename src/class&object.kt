//// example of class
//class Car{
//
//    var color ="Red"
//    var brand ="Toyota"
//
//    fun drive(){
//        println("The car is driving")
//    }
//    fun stop(){
//        println("The car is stopped")
//    }
//}
//
// example of creating object

//fun main(){
//
//    val myCar= Car() // here mycar is the object of class Car
//
//    println("Car brand: ${myCar.brand}")
//    println("Car color: ${myCar.color}")
//
//
//    myCar.drive()
//    myCar.stop()
//}


//// Changing the property values

//fun main(){
//
//    val car1=Car()
//    car1.color="Blue"
//    car1.brand="Honda"
//
//    val car2=Car()
//    car2.color="Black"
//    car2.brand="BMW"
//
//    println("Car1: Brand- ${car1.brand},color-${car1.color}")
//    println("Car2: Brand- ${car2.brand},color-${car2.color}")
//}



// Example of Constructor

class Car1(val brand: String, val color: String){
    fun showdetails(){
        println("Brand: $brand,Color: $color")
    }
}

fun main(){
    val car=Car1("Honda","white")
    car.showdetails()
}
