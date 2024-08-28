package easy;

public class Problem27 {

    public int removeElement(int[] nums, int val) {

        int result = 0;

        for (int n : nums) {
            if (n != val) nums[result++] = n;
        }

        return result;
    }
}
