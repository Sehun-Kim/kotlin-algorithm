package programmers.level1

import io.kotlintest.shouldBe
import org.junit.Test

class NewAccountRecommendationTest {

    @Test
    fun test1() {
        // given
        val new_id = "...!@BaT#*..y.abcdefghijklm"

        // when
        val result = NewAccountRecommendation().solution(new_id)

        // then
        result shouldBe "bat.y.abcdefghi"
    }

    @Test
    fun test2() {
        // given
        val new_id = "z-+.^."

        // when
        val result = NewAccountRecommendation().solution(new_id)

        // then
        result shouldBe "z--"
    }

    @Test
    fun test3() {
        // given
        val new_id = "=.="

        // when
        val result = NewAccountRecommendation().solution(new_id)

        // then
        result shouldBe "aaa"
    }

    @Test
    fun test4() {
        // given
        val new_id = "123_.def"

        // when
        val result = NewAccountRecommendation().solution(new_id)

        // then
        result shouldBe "123_.def"
    }

    @Test
    fun test5() {
        // given
        val new_id = "abcdefghijklmn.p"

        // when
        val result = NewAccountRecommendation().solution(new_id)

        // then
        result shouldBe "abcdefghijklmn"
    }

}