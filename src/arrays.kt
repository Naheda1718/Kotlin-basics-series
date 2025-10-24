fun main(){


    // Create a basic array
    val number= arrayOf(10,20,30,40,50)

    println(number[0])
    println(number[2])

    //Changing an array value

    val fruits=arrayOf("Apple","Banana","Cherry")

    fruits[1]="Mango"
    println(fruits.joinToString())

    //Looping through an array (with for loop)

    val languages=arrayOf("Kotlin","Java","Python")

    for (lang in languages){
        println(lang)
    }

    // Loop with Index

    val cities=arrayOf("Toronto","Vancouver","Montreal")

    for ((index,city)in cities.withIndex()){
        println("City at index $index is $city")
    }


}