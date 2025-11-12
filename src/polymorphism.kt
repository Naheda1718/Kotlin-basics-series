
// Run-time polymorphism example

/*open class Animal1{

    open fun makesound(){
        println("Animal makes a sound")
    }

}

class Dog: Animal1(){
    override fun makesound() {
        println("Dog barks")
    }
}

class Cat : Animal1(){
    override fun makesound() {
      println("Cat meows")
    }
}

fun main() {
   val animal11:Animal1=Dog()
    val animal2:Animal1=Cat()

   animal11.makesound()
    animal2.makesound()
}*/

// Compile time polymorphism example

class Calculator{
    fun add(a:Int, b:Int)=a+b
    fun add(a:Int, b:Int,c:Int)= a+b+c
}

fun main(){
    val cal= Calculator()
    println(cal.add(5,10)) //15
    println(cal.add(5,10,15))//30
}