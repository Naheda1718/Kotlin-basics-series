fun main(){

   greetuser()
   getparameter("Kotlin")
    val sum= addnumbers(10,20)
    println("sum is :$sum")


}
// Simple function
fun greetuser(){
    println("hello everyone")
}

// function with parameter

fun getparameter(name: String){
    println("HEY EVRYONE MY NAME IS $name")

}


//function that return value and short one -liner code

//
//fun addnumbers(a:Int, b: Int):Int{// this is returns the value
//    return a+b

//}
fun addnumbers(a:Int, b: Int)=a+b // this is short one -liner


