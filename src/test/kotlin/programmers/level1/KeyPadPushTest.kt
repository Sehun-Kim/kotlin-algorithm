package programmers.level1

import io.kotlintest.shouldBe
import org.junit.Test


class KeyPadPushTest {

    @Test
    fun test1() {
        // given
        val numbers = intArrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5)
        val hand = "right"

        // when
        val result = KeyPadPush().solution(numbers, hand)

        // then
        result shouldBe "LRLLLRLLRRL"
    }

    @Test
    fun test2() {
        // given
        val numbers = intArrayOf(7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2)
        val hand = "left"

        // when
        val result = KeyPadPush().solution(numbers, hand)

        // then
        result shouldBe "LRLLRRLLLRR"
    }

    @Test
    fun test3() {
        // given
        val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
        val hand = "right"

        // when
        val result = KeyPadPush().solution(numbers, hand)

        // then
        result shouldBe "LLRLLRLLRL"
    }

}