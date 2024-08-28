package medium;

public class Problem189 {

    public void rotate(int[] nums, int k) {
        int order = k % nums.length;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int newIndex = (i + order) % nums.length;
            result[newIndex] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
    }

    public void rotate1(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
