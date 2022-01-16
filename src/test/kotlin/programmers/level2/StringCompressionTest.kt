package programmers.level2

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class StringCompressionTest {

    @Test
    fun test1() {
        // given
        val s = "aabbaccc"

        // when
        val result = StringCompression().solution(s)

        //then
        result shouldBe 7
    }

    @Test
    fun test2() {
        // given
        val s = "ababcdcdababcdcd"

        // when
        val result = StringCompression().solution(s)

        //then
        result shouldBe 9
    }

    @Test
    fun test3() {
        // given
        val s = "abcabcdede"

        // when
        val result = StringCompression().solution(s)

        //then
        result shouldBe 8
    }

    @Test
    fun test4() {
        // given
        val s = "abcabcabcabcdededededede"

        // when
        val result = StringCompression().solution(s)

        //then
        result shouldBe 14
    }

    @Test
    fun test5() {
        // given
        val s = "xababcdcdababcdcd"

        // when
        val result = StringCompression().solution(s)

        //then
        result shouldBe 17
    }

}