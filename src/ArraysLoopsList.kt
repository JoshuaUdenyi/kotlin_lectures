
fun main(){
    val namesOfStudentInSpaceAi = mutableListOf(
        "tuna", "salmon", "Shark"
    )
    namesOfStudentInSpaceAi.add(0,"John JB")

    var ageOfJBfromPrimaryOne = listOf(
        1,2,3,4,5,6,7,8
    )

   // namesOfStudentInSpaceAi = ageOfJBfromPrimaryOne
    // Assigning val is not allowed
    println(namesOfStudentInSpaceAi)


    // Do-While Looping Struct
    var count = 7
    do {
        println(count)
        count++
    } while (count <= 5)

    //Repeat
    repeat(100){
        println("Joshua")
    }

    // For loop iterating over a range
    for (i in 1..100){
        println("John")
    }

    //More variations of for loop
    /*
    * downTo
    * step*/

    for (i in 'a'..'z'){
        print(i + " ")
    }

    //For loop iterating over a collection
    for (number in ageOfJBfromPrimaryOne){
        println(number)
    }

    //For loop iterating over with an index
    for ((index,element) in ageOfJBfromPrimaryOne.withIndex()){
        println("Age of JB at index: $index with value of ${element}")
    }


    //Making a char into a string
    val charArray = charArrayOf('H','e','l','l','o')
    val string = String(charArray)

    println(string)


    //Using DownTo and Step in for loop

//    for (i in 5 downTo 1){
//        print(i)
//        println()
//
//    }

    // using step
    for (i in 3..6 step 2){
        println(i)
    }
}