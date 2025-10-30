fun main(){

    // function overloading
     greet()
    greet("Alex")

// Named argumemt
    userInfo(age=25, name="Alex")
}


// Function Overloading
fun greet(){
    println("Hello Everyone")
}

fun greet(name: String)
{
    println("Hello $name")
}

// Example of Named Arguments

fun userInfo(name: String, age:Int){
    println("name:$name, age: $age")
}

