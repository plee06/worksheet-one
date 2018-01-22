/*
* Implement the accumulate operation, which, given a collection and an operation to perform on each
* element of the collection, returns a new collection containing the result of applying that operation to each
* element of the input collection.
*
* */


object Accumulate {
    /**
     * Takes in a general type of T, returns R, and returns a List of Type R.
     * The parameters are: a list of general type, a function which returns a value, return of a List of type R.
     *
     * */


    fun <T, R> accumulate(collection: List<T>, function: (T) -> R): List<R> {
        // TODO
        return listOf<R>()
    }

    /*
    * Test Hello World in Kotlin
    *
    * */
    fun sayHello()
    {
        println("Hello World!")
    }
    /*
    * Squares a number in a collection
    * Takes in a parameter of an int, squares it and returns the square of type Int
    * */
    fun squared(a: Int): Int
    {
        return a * a
    }
}

fun main(args: Array<String>)
{
    // Collection of numbers to be used for accumulate
    val numbers: MutableList<Int> = mutableListOf(1,2,3,4,5)
    val newNumbers: MutableList<Int> = mutableListOf<Int>() // Empty MutableList of type Int

    for (everyNumber in numbers)
    {
        newNumbers.add(Accumulate.squared(everyNumber))
    }

    println(numbers)
    println(newNumbers)

}