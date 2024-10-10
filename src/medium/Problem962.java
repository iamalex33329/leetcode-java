package medium;

public class Problem962 {

    public int maxWidthRamp(int[] nums) {

        int result = 0;

        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] < nums[j]) result = Math.max(result, j-i);
            }
        }
        return result;
    }

    public int maxWidthRamp2(int[] nums) {
        int left = 1, right = nums.length - 1, maxWidth = 0;

        while (left <= right) {
            int midWidth = left + (right - left) / 2;

            if (canFormRamp(nums, midWidth)) {
                maxWidth = midWidth;
                left = midWidth + 1;
            } else {
                right = midWidth - 1;
            }
        }
        return maxWidth;
    }

    private boolean canFormRamp(int[] nums, int width) {
        int i = 0, j = width;
        int minVal = nums[i];

        while (j < nums.length) {
            if (nums[j] >= minVal) return true;

            j++;
            i++;

            minVal = Math.min(minVal, nums[i]);
        }
        return false;
    }
}
