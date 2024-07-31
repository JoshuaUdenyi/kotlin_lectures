fun main() {

    //var numberOfFish = readln().toInt()
    val numberOfPlants = 12
//
//    println(" I have ${numberOfPlants + numberOfFish}  fish and plants" )
//
////Learning If/else
//
//    if(numberOfFish > numberOfPlants) {
//        println("Good ratio")
//    }else{
//        println("Unhealthy diet")
//        numberOfFish += 100
//    }
//
//    println(numberOfFish)
//
//    if (numberOfFish > 100){
//        println("Good ratio")
//    }

    //You want to screen out civil servants above age 18 and less than age 65

//    var age:String = readln()
//
//    if (age.toInt() < 18 || age.toInt() > 65){
//        print("Eligible for discount")
//    }


//    val fish = 50
//    if (fish in 1..100) {
//        print(fish)
//    } else if () {
//
//    } else if () {
//
//    } else {
//
//    }

//    when(numberOfFish){
//        0 -> println("Empty tank")
//        in 1..39 -> println("I got a fish")
//        else -> println("Thats a lot of fish APK_LEO")
//    }

//    Learning about nullability
    var rocks : Int? = null

    //var nameOfUserInDatabaseNonNull: String = null
    var nameOfUserInDatabaseNullType: String? = null
/*
    When you have complex data types, such as a list:
    You can allow the elements of the list to be null.
    You can allow for the list to be null, but if it's not null its elements cannot be null.
    You can allow both the list or the elements to be null.
    */

    var fishFoodTreats:Int? = null
//    if (fishFoodTreats != null){
//        fishFoodTreats.dec()
//    }

    fishFoodTreats = fishFoodTreats?.dec() ?: 0

    println(fishFoodTreats)
//    Meaning of ?: -> Elvis Operator

    //val len = s!!.length
}


/*
*  when (statement){
*       statement -> result
*
* }
* */

