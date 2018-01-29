/**
 * Compute the prime factors of a given natural number.
 * Remember that prime numbers are numbers that are divisible only by itself and 1.
 *
 * Prime Factorization is finding the prime numbers which multiply to find the current said number ..
 *
 * */

object PrimeFactorCalculator {

    fun primeFactors(long: Long): List<Long>
    {
        // First we find all the possible factors of the number
        // Remember that the Kotlin for loop is inclusive of the last number
        var ml: MutableList<Long> = mutableListOf<Long>()
        var temp: Long = long

        for (i in 2..long)
        {
            // Check if the current number is a factor and if it is a prime
            if (long % i == 0L)
            {
                if (checkPrime(i))
                {
                    // If we find a number that is both a possible factor and a prime number begin to divide into it
                    while (checkDivisibility(temp,i))
                    {
                        temp = temp / i
                        ml.add(i)
                    }
                }
            }
        }

        return ml
    }

    /**
     * Check if a specific number is prime with a for loop.
     *
     * If the number divides evenly into some number between 2 and limit - 1, return false that means it is not prime.
     * Otherwise, return true, it is prime!
     *
     * */
    fun checkPrime(long: Long): Boolean
    {
        for (i in 2..long - 1)
        {
            if (long % i == 0L)
            {
                return false;
            }
        }

        return true;
    }

    fun checkDivisibility(temp: Long, factor: Long): Boolean
    {
        while (temp % factor == 0L)
        {
            return true;
        }

        return false;
    }

}

