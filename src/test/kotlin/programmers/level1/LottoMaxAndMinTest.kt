package programmers.level1

import io.kotlintest.shouldBe
import org.junit.Test

class LottoMaxAndMinTest {

    @Test
    fun test1() {
        // given
        val lottos = intArrayOf(44, 1, 0, 0, 31, 25)
        val win_nums = intArrayOf(31, 10, 45, 1, 6, 19)

        // when
        val result = LottoMaxAndMin().solution(lottos, win_nums)

        // then
        result shouldBe intArrayOf(3, 5)
    }

}