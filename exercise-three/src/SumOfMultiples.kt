/**
 * Take in a "Set" of factors and a specific "limit" number.
 *
 * For each number in the set of factors, return the multiples of that number up to the limit number.
 *
 * For example, if the limit is 20 and our factors are 3,5
 *
 * We would get:
 *
 * For 3: 3,6,9,12,15,18 ...
 * For 5: 5,10,15...
 *
 * Return the sum of all these numbers!
 *
 * */


object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int
    {
        var sum: Int = 0
        val multiples: MutableSet<Int> = mutableSetOf<Int>()

        for (eachFactor in factors)
        {
            multiples.addAll(calcMultiple(eachFactor,limit))
        }


        for (eachNumber in multiples)
        {
            sum += eachNumber
        }

        return sum
    }

    fun calcMultiple(num: Int, limit: Int): MutableSet<Int>
    {
        /*
        * In Kotlin the range from someNumber .. someNumber is inclusive!
        *
        * */
        val multiples: MutableSet<Int> = mutableSetOf<Int>()

        for (i in 1..limit - 1)
        {
            if (i % num == 0)
            {
                multiples.add(i)

            }
        }
        return multiples
    }


}

fun main(args: Array<String>)
{

    println(SumOfMultiples.sum(setOf(3,5),20))
}
