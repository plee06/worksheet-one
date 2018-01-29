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

        /*
        * Take the phrase
        * .and make it Lower Case
        * .then
        * */

        var p: List<String> = phrase.toLowerCase().split(" ")
        var m: MutableMap<String, Int> = mutableMapOf()

        println(p)

        for (word in p)
        {
            if (m.containsKey(word)) m.getValue(word) + 1 else m[word] = 1

        }

        return m
        

    }



}

