package medium;


import java.util.HashMap;

public class Problem1590 {

    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        double sum = 0;

        for (int num : nums) sum += num;
        if (sum % p == 0) return 0;

        sum %= p;
        int s = (int) sum;

        HashMap<Integer, Integer> map = new HashMap<>();
        int len = n;
        int mod = 0;

        for (int i=0; i<n; i++) {
            if (len == 1) return 1;

            mod = (nums[i] + mod) % p;
            map.put(mod, i);  // 儲存當前餘數及對應索引

            // 如果找到匹配的餘數，更新最小子陣列長度
            if (s == mod) len = Math.min(i + 1, len);

            if (map.get((mod + p - s) % p) != null) {
                len = Math.min(len, i - map.get((mod + p - s) % p));
            }
        }

        return len == n ? -1 : len;
    }
}
