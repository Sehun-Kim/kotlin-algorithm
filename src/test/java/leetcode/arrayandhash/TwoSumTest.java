package leetcode.arrayandhash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void test1() {
        // given
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // when
        int[] result = new TwoSum().twoSum(nums, target);

        // then
        int[] answer = {0, 1};
        assertEquals(answer[0], result[0]);
        assertEquals(answer[1], result[1]);
    }

    @Test
    void test2() {
        // given
        int[] nums = {3, 2, 4};
        int target = 6;

        // when
        int[] result = new TwoSum().twoSum(nums, target);

        // then
        int[] answer = {1, 2};
        assertEquals(answer[0], result[0]);
        assertEquals(answer[1], result[1]);
    }


    @Test
    void test3() {
        // given
        int[] nums = {3, 3};
        int target = 6;

        // when
        int[] result = new TwoSum().twoSum(nums, target);

        // then
        int[] answer = {0, 1};
        assertEquals(answer[0], result[0]);
        assertEquals(answer[1], result[1]);
    }

}