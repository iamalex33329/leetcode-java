package medium;

public class Problem153 {

    /* O(n) */
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;

        while (l < r) {
            if (nums[l] > nums[r]) {
                r--;
            } else if (nums[l] < nums[r]) {
                break;
            }
        }
        return nums[(r + 1) % nums.length];
    }

    /* 有用到Binary Search O(log(n)) */
    public int findMin1(int[] nums) {
        int l = 0, r = nums.length-1;

        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return nums[l];
    }
}
