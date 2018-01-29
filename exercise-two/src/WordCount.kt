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
        * Counts words when one of each
        * Counts one word
        * Counts case insensitively
        * Counts multiple occurences
        *
        *
        * */
        /*
        * Split up the phrase into all lowercase Strings
        * */
        var p: List<String> = phrase
                .toLowerCase()
                .replace(",\n", " ")
                .split(" ")

        println(p)
        /*
        * Initialize and declare a mutable map of types String and Int
        * */
        var m: MutableMap<String, Int> = mutableMapOf()

        for (word in p)
        {

            if (m.containsKey(word))
            {
                m.put(word, m.getValue(word) + 1)
            }
            else
            {
                m[word] = 1
            }
        }

        return m


    }



}

