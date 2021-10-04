package programmers.level1

class LottoMaxAndMin {

    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var matchCnt = 0
        var zero = 0
        lottos.forEach {
            if (it == 0) {
                zero++
            } else {
                if (win_nums.contains(it)) {
                    matchCnt++
                }
            }
        }

        val best = matchResult(matchCnt + zero)
        val worst = matchResult(matchCnt)

        return intArrayOf(best, worst)
    }

    fun matchResult(matchCnt: Int): Int = when (matchCnt) {
        6 -> 1
        5 -> 2
        4 -> 3
        3 -> 4
        2 -> 5
        else -> 6
    }

}
