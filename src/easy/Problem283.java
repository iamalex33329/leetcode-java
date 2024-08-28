package easy;

public class Problem283 {

    public void moveZeroes(int[] nums) {

        for (int i=nums.length-2; i>=0; i--) {
            if (nums[i] == 0) {
                int j = i;

                while (j < nums.length - 1) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;

                    j++;
                }
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        int n = nums.length;
        int[] na = new int[n];

        int j = 0;
        for (int num : nums) {
            if (num != 0) na[j++] = num;
        }

        for (int i=0; i<j; i++) nums[i] = na[i];
        for (int i=j; i<n; i++) nums[i] = 0;
    }

    public void moveZeroes3(int[] nums) {
        int lastNonZeroFoundAt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[i];
                nums[i] = tmp;

                lastNonZeroFoundAt++;
            }
        }
    }
}
