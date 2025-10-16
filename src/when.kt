fun main(){

    val day=3

 /*  if (day == 1) {
        println("Monday")
    } else if (day == 2) {
        println("Tuesday")
    } else if (day == 3) {
        println("Wednesday")
    } else if (day == 4) {
        println("Thursday")
    } else if (day == 5) {
        println("Friday")
    } else if (day == 6) {
        println("Saturday")
    } else if (day == 7) {
        println("Sunday")
    } else {
        println("Invalid day")
    }

  */
    val dayname= when(day){
        1 -> "monday"
        2 -> "tuesday"
        3 -> "wednesday"
        4 -> "thursday"
        5 -> "friday"
        6 -> "saturday"
        7 -> "sunday"
        else -> "invalid day"
    }
   print("Today is $dayname")


}