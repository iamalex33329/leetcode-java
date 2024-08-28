package medium;

public class Problem2962 {

    public static long countSubarrays(int[] nums, int k) {
        int maxNum = Integer.MIN_VALUE;
        int maxCount = 0;

        // 找到最大值，以及最大值共幾個
        for (int num : nums) {
            if (num > maxNum) {
                maxCount = 1;
                maxNum = num;
            } else if (num == maxNum) {
                maxCount++;
            }
        }
        if (k > maxCount) return 0;

        // 計算總共的子陣列
        int totalCount = 0;
        for (int i=0; i<nums.length; i++) {
            int end = i;
            int remainingTarget = k;
            boolean foundTarget = false;
            while (end < nums.length) {
                if (nums[end] == maxNum) remainingTarget--;
                if (remainingTarget == 0) foundTarget = true;
                if (foundTarget) totalCount++;

                end++;
            }
        }

        return totalCount;
    }

    public static long countSubarrays1(int[] nums, int k) {
        int max = Integer.MIN_VALUE;

        // 找出陣列中的最大值
        for (int num : nums)
            max = Math.max(num, max);

        long ans = 0;
        int l = 0, r = 0, n = nums.length;

        // 使用雙指針來維護一個窗口，記錄子陣列中的最大值數量
        while (r < n) {
            // 若窗口中的元素為最大值，將 k 減 1
            k -= (nums[r] == max) ? 1 : 0;
            r++; // 增加右指針，擴展窗口範圍

            // 當 k 減為 0 時，表示窗口中包含 k 個最大值
            while (k == 0) {
                // 若窗口最左邊的元素為最大值，將 k 加 1，並縮小窗口範圍
                k += (nums[l] == max) ? 1 : 0;
                l++;
            }
            // 將左指針的位置加到答案中，表示目前子陣列的數量
            ans += l;
        }
        return ans;
    }
}
