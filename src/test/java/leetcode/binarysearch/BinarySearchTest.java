package leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void test1() {
        // given
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        // when
        int result = new BinarySearch().search(nums, target);

        // then
        assertEquals(result, 4);
    }

    @Test
    void test2() {
        // given
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;

        // when
        int result = new BinarySearch().search(nums, target);

        // then
        assertEquals(result, -1);
    }

    @Test
    void test3() {
        // given
        int[] nums = {-4, 2, 10, 12, 15, 20, 26};
        int target = 10;

        // when
        int result = new BinarySearch().search(nums, target);

        // then
        assertEquals(result, 2);
    }

}