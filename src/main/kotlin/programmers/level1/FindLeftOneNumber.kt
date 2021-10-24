package programmers.level1

class FindLeftOneNumber {

    fun solution(n: Int): Int {
        val num = (n - 1)

        for (i: Int in 2..n) {
            if (num % i == 0) return i
        }

        return num
    }

}