package medium;

import java.util.HashSet;

public class Problem287 {

    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(nums[i])) { return i; }
            set.add(nums[i]);
        }

        return 0;
    }

    public int findDuplicate1(int[] nums) {
        int[] cnt = new int[nums.length+1];

        for (int num : nums) { cnt[num]++; }

        for (int i=1; i<cnt.length; i++) { if (cnt[i] > 1) return i; }
        return 0;
    }


    /* 鴿籠原理，所以nums裡面必定會有至少一個重複 */
    public int findDuplicate2(int[] nums) {
        for (int num : nums) {
            int idx = Math.abs(num);

            if (nums[idx] < 0) { return idx; }
            else nums[idx] = -nums[idx];
        }

        return 0;
    }
}
