fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("test_input")
    check(part1(testInput) == 1)


    val input = readInput("input")

    part1(input).println()
    part2(input).println()
}
