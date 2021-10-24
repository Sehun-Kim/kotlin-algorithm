package programmers.level1

import kotlin.math.absoluteValue

class KeyPadPush {
    private val leftHandNums = intArrayOf(1, 4, 7)
    private val rightHandNums = intArrayOf(3, 6, 9)

    private var left = 0
    private var right = 0

    fun solution(numbers: IntArray, hand: String): String {
        left = 10
        right = 12

        return numbers.map {
            val number = if (it == 0) 11 else it
            val result = judgeClickHand(number, hand)

            if (result == "R") right = number else left = number

            result
        }.joinToString("")
    }

    private fun judgeClickHand(number: Int, hand: String): String = when {
        leftHandNums.contains(number) -> "L"
        rightHandNums.contains(number) -> "R"
        else -> {
            val leftDistance = getDistance(number, left)
            val rightDistance = getDistance(number, right)

            when {
                leftDistance == rightDistance ->
                    if (hand == "right") "R" else "L"
                leftDistance < rightDistance -> "L"
                else -> "R"
            }
        }
    }

    private fun getDistance(number: Int, position: Int): Int {
        val point = (position - number).absoluteValue
        val upPoint = point / 3
        val sidePoint = point % 3

        return upPoint + sidePoint
    }

}