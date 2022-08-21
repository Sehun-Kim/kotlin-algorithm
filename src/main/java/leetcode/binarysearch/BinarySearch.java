package leetcode.binarysearch;

public class BinarySearch {

    public int search(int[] nums, int target) {
        return recursiveSearch(nums, 0, nums.length - 1, target);
    }

    private int recursiveSearch(int[] nums, int first, int last, int target) {
        if (first > last)
            return -1;
        int midIdx = (first + last) / 2;
        if (nums[midIdx] == target) {
            return midIdx;
        } else if (nums[midIdx] > target) {
            return recursiveSearch(nums, first, midIdx - 1, target);
        } else {
            return recursiveSearch(nums, midIdx + 1, last, target);
        }
    }

}
