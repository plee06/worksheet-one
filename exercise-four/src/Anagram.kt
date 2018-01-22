/**
 * Given a word and a list of possible anagrams (a word that contains all characters of the passed in word)
 * return a list of the anagrams.
 *
 * */


/*
* The below is a class of Anagram with a constructor that takes in a private val of a word which is type String
* */
class Anagram(private val word: String) {
    /**
     * This function takes in a Collection of type <String> and returns a Set of type <String>
     *
     * */

    init { println("Constructing this object ... ") }

    fun match(anagrams: Collection<String>): Set<String> {
        val toChar: CharArray = word.toCharArray()
        val check: MutableList<Char> = mutableListOf<Char>()
        val literals: MutableSet<String> = mutableSetOf<String>()

        for (eachChar in toChar)
        {
            check.add(eachChar)
        }

        val c: List<Char> = check.sorted()

        for (eachWord in anagrams)
        {
            var charsToCheck: List<Char> = eachWord.toCharArray().sorted()

            println(c)
            println(charsToCheck)

            if (c == charsToCheck)
            {
                literals.add(eachWord)
            }
        }

        return literals
    }
}

/*
* The function should check all the characters in the word and then check each anagram in the collection
* to see if all characters in exist in that String. If it does, add it to the list, if not, skip over it -- it's
* not an Anagram!
*
*
* */

fun main(args: Array<String>)
{
    // Declaration and initialization of Anagram with the word "listen" passed in
    val ana: Anagram = Anagram("listen")
    val anagrams: List<String> = listOf("enlists", "google", "inlets", "banana")

    println(ana.match(anagrams))


}