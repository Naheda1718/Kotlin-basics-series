/* Simple overriding example
open class Animal{

    open fun makesound(){
        println("Animal makes a sound")
    }

}

class Dog: Animal(){
    override fun makesound() {
       println("Dog barks")
    }
}

fun main(){
    val animal=Animal()
    animal.makesound()

    val dog=Dog()
    dog.makesound()
}*/

// Using a super keyword
/*open class Vehicle1{
    open fun start(){
        println("Vehicle is starting")
    }
}

class Car2: Vehicle1(){
    override fun start(){
        super.start()
        println("Caris starting smoothly")
    }
}

fun main(){
    val car= Car2()
    car.start()
}*/
// Overriding properties example

open class  Person{
    open val role:String="Person"
}

class  Student:Person(){
    override val role: String="Student"

}

fun main()
{
    val student=Student()
    println(student.role)

}
