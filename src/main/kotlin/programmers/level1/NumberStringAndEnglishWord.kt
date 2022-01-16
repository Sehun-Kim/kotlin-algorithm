package programmers.level1

class NumberStringAndEnglishWord {

    val numMap = mapOf(
        "zero" to 0,
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9
    )

    fun solution(s: String): Int {
        var answer = s
        numMap.forEach { answer = answer.replace(it.key, it.value.toString()) }

        return answer.toInt()
    }

}