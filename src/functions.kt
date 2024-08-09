import java.util.*

fun main(args: Array<String>) {
//    val isUnit = println("This is an expression")
//    println(isUnit)
//
//    val temperature = 100
//    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
//    println(message)

    feedTheFish()

}

//fun functionName(): DataType {
//kotlin.Unit
//}

//fun addNumbers(){
//    println(10 + 10)
//}
//
//fun checkAge(age: Int): String{
//    if (age < 18){
//        print("You're too young John")
//    }else{
//        print("No output")
//    }
//
//    return "You're old enough"
//}

fun randomDay(): String {
    val week = arrayOf(
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    )

    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String): String {

   return when (day) {
        "Monday" -> "flakes"
        "Tuesday" ->  "pellets"
        "Wednesday" -> "redworms"
        "Thursday" ->  "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "Nothing they starve to death"
    }
}


fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}