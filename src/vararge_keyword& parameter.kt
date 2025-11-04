/*  without vararg keyword example (Normal Method)
fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    printNumbers(numbers)
}

fun printNumbers(numbers: Array<Int>) {
    for (num in numbers) {
        println(num)
    }
}*/

fun main(){
    printnumbers(1,2,3,4,5)  // using vararg
   studentmarks("Naheda",85,90,80) // using parameter

    val nums=intArrayOf(5,10,15) //
    printNmbers(*nums)// using speard operator (*)

}

// example of using vararg keyword

fun printnumbers(vararg numbers: Int){
    for (num in numbers){
        println(num)
    }
}

// Example of using parameter with vararg

fun studentmarks(name: String, vararg marks: Int) {
    println("Student Name: $name")
    for (mark in marks) {
        println("Mark: $mark")
    }
}

// Example of using spread operator (*)

fun printNmbers (vararg  numbers : Int){
    for (num in numbers){
        println(num)
    }
}
