package leetcode.arrayandhash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainsDuplicateTest {

    @Test
    void test1() {
        // given
        int[] nums = {1,2,3,1};

        // when
        boolean result = new ContainsDuplicate().containsDuplicate(nums);

        // then
        assertEquals(true, result);
    }

    @Test
    void test2() {
        // given
        int[] nums = {1,2,3,4};

        // when
        boolean result = new ContainsDuplicate().containsDuplicate(nums);

        // then
        assertEquals(false, result);
    }

    @Test
    void test3() {
        // given
        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        // when
        boolean result = new ContainsDuplicate().containsDuplicate(nums);

        // then
        assertEquals(true, result);
    }
}