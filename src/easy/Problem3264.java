package easy;

public class Problem3264 {

    public int[] getFinalState(int[] nums, int k, int multiplier) {

        while (k > 0) {
            int minIndex = 0;

            for (int i=1; i<nums.length; i++) {
                if (nums[i] < nums[minIndex]) minIndex = i;
            }

            nums[minIndex] *= multiplier;
            k--;
        }

        return nums;
    }
}