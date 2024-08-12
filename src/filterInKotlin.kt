fun main() {
    val decorations = listOf(
        "ROCK", "PAGODA", "PLASTIC PLANT", "ALLIGATOR", "FLOWERPOT", "GOAT"
    )
    // Using Named lambda Paramter
    println(decorations.filter { currValue -> currValue[0] == 'P' })

    //Using Kotlin default Parameter naming
//    println(decorations.filter { it[0] == 'P' })

    val eager = decorations.filter { it[0] == 'P' }
    println("eager: $eager")

    val filtered = decorations.asSequence().filter { it[0] == 'P' }
    println("filtered: $filtered")

    val newList = filtered.toList()
    println("new list: $newList")


    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("------")
    println("first: ${lazyMap.first()}")
    println("------")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter { it[0] == 'P' }.map {
        println("access : $it")
        it
    }

    println("--------------------------------")
    println("filtered: ${lazyMap2.toList()}")
}


//Higher Order function
var dirtyLevel = 20
val waterFilter = { dirty: Int -> dirty / 2 }
println(waterFilter(dirtyLevel))
10

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

val waterFilter: (Int) -> Int = { dirty ->
    dirty / 2
}

println(updateDirty(20, waterFilter))
10