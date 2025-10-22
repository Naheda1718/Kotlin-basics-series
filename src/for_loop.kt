// sytax of for loop
//for (item in collection){
//
//}

fun main(){

    //Range
    for (i in 1..5){
        println("number : $i")
    }


    // Use of Until

    for (i in 1 until 5){
        println("value : $i")
    }


    // Use of downTo
    for (i in 5 downTo 1){
        println("Countdown : $i")

    }

    // Use of Step

    for (i in 1..10 step 2){
        println("step value: $i")
    }

    // Use of Array
    val fruits= arrayOf("Apples","Banana", "Cherry")
    for (fruit in fruits){
        println(fruit)
    }

    val colors = listOf("Red","Green","Blue")
    for ((index, color) in colors.withIndex()){
        println("Color at index $index is $color")
    }

}
