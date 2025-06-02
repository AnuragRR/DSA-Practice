package Array;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> rawHashMap = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!rawHashMap.containsKey(target - nums[i])) {
                rawHashMap.put(nums[i], i);
            } else {
                int firstValue = rawHashMap.get(target - nums[i]);

                ans[0] = firstValue;
                ans[1] = i;

                break;
            }
        }
        return ans;
    }
}
