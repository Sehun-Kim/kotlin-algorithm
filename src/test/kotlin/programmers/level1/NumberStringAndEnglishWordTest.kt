package programmers.level1

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class NumberStringAndEnglishWordTest {

    @Test
    fun `test1`() {
        // given
        val s = "one4seveneight"

        // when
        val result = NumberStringAndEnglishWord().solution(s)

        // then
        result shouldBe 1478
    }

    @Test
    fun `test2`() {
        // given
        val s = "23four5six7"

        // when
        val result = NumberStringAndEnglishWord().solution(s)

        // then
        result shouldBe 234567
    }

    @Test
    fun `test3`() {
        // given
        val s = "2three45sixseven"

        // when
        val result = NumberStringAndEnglishWord().solution(s)

        // then
        result shouldBe 234567
    }

    @Test
    fun `test4`() {
        // given
        val s = "123"

        // when
        val result = NumberStringAndEnglishWord().solution(s)

        // then
        result shouldBe 123
    }

}