import kotlin.math.abs

fun main() {
    fun part1(left: List<Int>, right: List<Int>): Int {
        val leftValues = left.toMutableList()
        val rightValues = right.toMutableList()
        var totalDistance = 0

        while (leftValues.isNotEmpty()) {
            val minLeft = leftValues.min()
            val minRight = rightValues.min()
            totalDistance += abs(minLeft - minRight)
            leftValues.remove(minLeft)
            rightValues.remove(minRight)
        }

        return totalDistance
    }

    fun part2(left: List<Int>, right: List<Int>): Int {
        return left.sumOf { leftNumber ->
            leftNumber * right.count { it == leftNumber }
        }
    }

    fun mapLeft(values: List<List<String>>): List<Int> {
        return values.map { it[0] }.map { it.toInt() }
    }

    fun mapRight(values: List<List<String>>): List<Int> {
        return values.map { it[1] }.map { it.toInt() }
    }

    val testInput = readInput("test_input01")
    val testValues = testInput.map { it.split("   ") }
    val testLeft = mapLeft(testValues)
    val testRight = mapRight(testValues)

    check(part1(testLeft, testRight) == 11)
    check(part2(testLeft, testRight) == 31)

    val input = readInput("input1")

    val values = input.map { it.split("   ") }
    val left = mapLeft(values)
    val right = mapRight(values)

//    println(part1(left, right))
    println(part2(left, right))
}
