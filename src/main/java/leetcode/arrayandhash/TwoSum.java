package leetcode.arrayandhash;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            numMap.merge(nums[i], i, (v1, v2) -> v1 + v2);
        }

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            int otherIdx = numMap.getOrDefault(remain, i);
            if (otherIdx != i && nums.length > otherIdx) {
                int expectRemain = nums[otherIdx];
                if (expectRemain == remain) {
                    if (i < otherIdx) {
                        result[0] = i;
                        result[1] = otherIdx;
                    } else {
                        result[0] = otherIdx;
                        result[1] = i;
                    }
                    return result;
                } else {
                    int idx = Math.abs(otherIdx - i);
                    if (i < idx) {
                        result[0] = i;
                        result[1] = idx;
                    } else {
                        result[0] = idx;
                        result[1] = i;
                    }
                    return result;
                }
            }
        }

        return result;
    }

}
