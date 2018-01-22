/**
 * Implement Pascal's Triangle in Kotlin .
 *
 * Remember that Pascal's triangle is where every number is the sum of the two numbers to the left and right above it
 * position wise.
 * 1
 * 11
 * 121
 * 1331
 * 14641 --> 5th row for 5.
 *
 * */

object PascalsTriangle {

    fun computeTriangle(rows: Int): List<List<Int>> {
        var triangle: MutableList<MutableList<Int>> = mutableListOf<MutableList<Int>>()
        triangle.add(mutableListOf<Int>(1))
        triangle.add(mutableListOf<Int>(1,1))

        println(triangle)
        for (i in 2..rows - 1)
        {
            var row: MutableList<Int> = mutableListOf<Int>()
            triangle.add(row)
            triangle[i].add(1)

            for (j in 1..i - 1)
            {
                var right: Int = triangle[i - 1][j]
                var left: Int = triangle[i - 1][j - 1]
                var sum: Int = left + right
                triangle[i].add(sum)
            }
            triangle[i].add(1)
        }

        println(triangle)
        return triangle
    }
}

fun main(args: Array<String>)
{
    println(PascalsTriangle.computeTriangle(10))
}