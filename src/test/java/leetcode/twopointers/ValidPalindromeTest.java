package leetcode.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void test1() {
        // given
        String s = "A man, a plan, a canal: Panama";

        // when
        boolean result = new ValidPalindrome().isPalindrome(s);

        // then
        assertEquals(true, result);
    }

    @Test
    void test2() {
        // given
        String s = "race a car";

        // when
        boolean result = new ValidPalindrome().isPalindrome(s);

        // then
        assertEquals(false, result);
    }

    @Test
    void test3() {
        // given
        String s = "  ";

        // when
        boolean result = new ValidPalindrome().isPalindrome(s);

        // then
        assertEquals(true, result);
    }

    @Test
    void test4() {
        // given
        String s = "0P";

        // when
        boolean result = new ValidPalindrome().isPalindrome(s);

        // then
        assertEquals(false, result);
    }

}