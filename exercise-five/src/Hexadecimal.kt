/**
 * Write a program that involves converting a String representation of a Hexadecimal to Decimal format
 * Hexadecimals are Base 16 and are represented by the characters A to F.
 *
 * Steps involved for conversion:
 * Get the last digit of the hex number
 * Set a power variable to 0, which corresponds to the positions
 * Multiple the current digit of the hex number with (Base 16 ^ Power)
 * Increment Power by 1 and set the current digit to the next digit
 * Repeat until all digits have been converted
 * And then finally sum up all digits
 *
 * Test: 10af8c = 1093516 in Decimal
 *
 * */

object Hexadecimal {

    fun toDecimal(s: String): Int {
        val literals: List<Char> = s.toLowerCase().toCharArray().reversed()
        val hexaValues: Map<String, Int> = mapOf("a" to 10, "b" to 11, "c" to 12, "d" to 13, "e" to 14, "f" to 15)
        val base: Double = 16.0
        var currPower: Double = 0.0
        var res: Int = 0
        var currValue: Int = 0
        var hexaValueToDecimal: Int = 0


        for (eachPosition in literals)
        {
            if (hexaValues.containsKey(eachPosition.toString()))
            {
                currValue = hexaValues.get(eachPosition.toString())!!.toInt()
            }
            else
            {
                currValue = eachPosition.toString().toInt()
            }

            hexaValueToDecimal = (currValue * (Math.pow(base,currPower))).toInt()
            currPower += 1
            res += hexaValueToDecimal

        }

        return res
    }


}