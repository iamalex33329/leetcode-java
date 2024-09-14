package medium;

public class Problem2419 {

    public int longestSubarray(int[] nums) {
        int result = 0;
        int max = 0;

        // 找到 nums 中最大值，因為不可能有小數字 AND 出大數字
        for (int j : nums) max = Math.max(max, j);

        int count = 0;

        for (int num : nums) {
            if (num == max) {
                count++;
                result = Math.max(result, count);
            } else {
                count = 0;
            }
        }
        return result;
    }
}
