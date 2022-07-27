package leetcode.arrayandhash;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            if (numMap.putIfAbsent(num, 1) != null)
                return true;
        }

        return false;
    }
}
