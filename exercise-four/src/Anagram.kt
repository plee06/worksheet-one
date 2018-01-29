/**
 * Given a word and a list of possible anagrams (a word that contains all characters of the passed in word)
 * return a list of the anagrams.
 *
 * An anagram is word formed by the rearranging of another word. i.e. spar == rasp.
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

    fun match(anagrams: Collection<String>): Set<String> {

        /*
        * Filter the collection of passed in possible anagrams by length. If the length of the two do not match
        * filter it out, it's not a possible anagram.
        *
        * We then look through the returned list and check if the word itself in our anagrams list is equal
        * to the word, if it is keep it in.
        *
        * Next we again filter the returned list by taking each word and turning it into a character array and sorting it
        * ; same with the passed in word and comparing the two. Only if they are equal it should be returned.
        *
        * Finally, turn that to a set and return it.
        *
        * */

        var ms: MutableSet<String>  = mutableSetOf()


        for (words in anagrams)
        {
            // First filter based on length, is it the same length? If it is, it's a possible Anagram
            if (words.length == word.length ) ms.add(words)

            // Next filter out all words in the anagram that are exact duplicates, i.e. remove them from the set
            if (words.toLowerCase().equals(word.toLowerCase())) ms.remove(words)

            // Next convert all the words to a sorted character array and check if they are anagrams, i.e. they
            // all have the same characters! If no match, remove it from the set
            if (!(words.toLowerCase().toCharArray().sorted() == word.toLowerCase().toCharArray().sorted())) ms.remove(words)
        }

        return ms 

    }
}
