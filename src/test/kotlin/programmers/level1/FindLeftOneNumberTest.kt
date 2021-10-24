package programmers.level1

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class FindLeftOneNumberTest {

    @Test
    fun test1() {
        // given
        val n = 10

        // when
        val result = FindLeftOneNumber().solution(n)

        // then
        result shouldBe 3
    }

    @Test
    fun test2() {
        // given
        val n = 12

        // when
        val result = FindLeftOneNumber().solution(n)

        // then
        result shouldBe 11
    }

}