fun main(){

//    val number= arrayOf(10,20,30,40,50)
//
//    println(number[0])
//    println(number[2])

//    val fruits=arrayOf("Apple","Banana","Cherry")
//
//    fruits[1]="Mango"
//    println(fruits.joinToString())

  /*  val languages=arrayOf("Kotlin","Java","Python")

    for (lang in languages){
        println(lang)
    }*/

    val cities=arrayOf("Toronto","Vancouver","Montreal")

    for ((index,city)in cities.withIndex()){
        println("City at index $index is $city")
    }


}