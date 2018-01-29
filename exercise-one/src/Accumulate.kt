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

        // Create a variable called "res" of type MutableList<R> taking in a Generic type of R.
        // Initialize an empty mutable list with mutableListOf() ...
        var res: MutableList<R> = mutableListOf()

        /*
        * Iterate through every item in the passed in collection of List<T>
        *     and then run the function passed in on that specific item and add the result to the
        *     mutableList!
        * */
        for (item in collection)
        {
            res.add(function(item))
        }


        // Finally, return the list 
        return res.toList()
    }

}
