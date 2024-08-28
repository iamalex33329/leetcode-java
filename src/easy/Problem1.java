package easy;

import java.util.HashMap;

public class Problem1 {

    public int[] twoSum(int[] nums, int target) {

        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    /* Better Solution */
    public int[] twoSum1(int[] nums, int target) {

        // hashmap的find跟
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int sub = target - nums[i];
            if (hashMap.containsKey(sub)) {
                return new int[] {hashMap.get(sub), i};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
}
