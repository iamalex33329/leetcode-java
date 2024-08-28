package hard;

public class Problem41 {

    public int firstMissingPositive(int[] nums) {

        boolean[] visited = new boolean[nums.length + 1];

        for (int num : nums) {
            if (nums.length >= num && num > 0) visited[num] = true;
        }

        for (int i=1; i<visited.length; i++) {
            if (!visited[i]) return i;
        }

        return visited.length;
    }

    public int firstMissingPositive1(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) return i + 1;
        }

        return n + 1;
    }
}
