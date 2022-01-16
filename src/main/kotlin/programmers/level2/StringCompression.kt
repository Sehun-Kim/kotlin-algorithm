package programmers.level2

class StringCompression {

    fun solution(s: String): Int {
        var answer = Int.MAX_VALUE

        for (i in s.length downTo 1) {
            var cnt = 0
            var flag = s.subSequence(0, i)
            var zip = ""
            s.chunked(i).forEach { chunkedStr ->
                if (chunkedStr == flag) {
                    cnt += 1
                } else {
                    zip += ((cnt.takeIf { it > 1 }?.toString() ?: "") + (flag))
                    flag = chunkedStr
                    cnt = 1
                }
            }
            zip += ((cnt.takeIf { it > 1 }?.toString() ?: "") + (flag))

            answer = if (answer < zip.length) answer else zip.length
        }

        return answer
    }

}