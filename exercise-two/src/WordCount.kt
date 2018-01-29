/**
 * Given a phrase, count the occurrences of each word in that phrase
 *
 * */


object WordCount {

    /*
    * Count the occurences of a word of the phrase.
    *
    * Return of the data structure type Map with Key,Value pair of String and Int
    * */
    fun phrase(phrase: String): Map<String, Int> {

        return phrase.split(" ").groupingBy{ it.toLowerCase() }.eachCount()
    }



}

