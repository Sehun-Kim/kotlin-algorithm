package leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void test1() {
        // given
        String s = "()";

        // when
        boolean result = new ValidParentheses().isValid(s);

        // then
        assertEquals(true, result);
    }

    @Test
    void test2() {
        // given
        String s = "()[]{}";

        // when
        boolean result = new ValidParentheses().isValid(s);

        // then
        assertEquals(true, result);
    }

    @Test
    void test3() {
        // given
        String s = "(]";

        // when
        boolean result = new ValidParentheses().isValid(s);

        // then
        assertEquals(false, result);
    }

    @Test
    void test4() {
        // given
        String s = "}";

        // when
        boolean result = new ValidParentheses().isValid(s);

        // then
        assertEquals(false, result);
    }
}