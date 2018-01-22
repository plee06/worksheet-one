/**
 * Given a phrase, count the occurrences of each word in that phrase
 *
 * */


object WordCount {

    /*
    * Function called phrase that takes in an argument of type String and returns a Map with the K,V pair being
    * a type of String and type of Int
    * */
    fun phrase(phrase: String): Map<String, Int> {
        return count(phrase)
    }

    fun count(phrase: String): MutableMap<String, Int>
    {

        val splitWords: List<String> = phrase.split(" ")
        // To declare and intialize an empty HashMap in Kotlin must put the HashMap<String,Int>() on RHS
        val splitMapCount: MutableMap<String, Int> = mutableMapOf<String,Int>()

        /*
        * For every word in the list of splitWords add the specific count and word into the map of
        * splitMapCount
        *
        * */

        for (eachWord in splitWords)
        {
            if (splitMapCount.containsKey(eachWord))
            {
                var valInMap: Int? = splitMapCount.get(eachWord)
                // "Smart cast"
                var castedValue: Int = valInMap!!

                castedValue += 1
                splitMapCount.set(eachWord, castedValue)
            }
            else
            {
                splitMapCount.put(eachWord, 1)
            }
        }
        return splitMapCount

    }

}



fun main(args: Array<String>)
{
    // Declaration and intialization of phrase as type String with String as "olly olly in come free"
    val phrase: String = "olly olly in come free"

    println(WordCount.phrase(phrase))

}
