package medium;

public class Problem2044 {

    public int countMaxOrSubsets(int[] nums) {
        int targetOR = 0;
        for (int num : nums) targetOR |= num;

        return findSubsets(nums, targetOR, 0, 0);
    }

    private int findSubsets(int[] nums, int targetOR, int currentOR, int index) {
        if (index == nums.length) {
            return currentOR == targetOR ? 1 : 0;
        }

        return findSubsets(nums, targetOR, currentOR, index + 1) +
                findSubsets(nums, targetOR, currentOR | nums[index], index + 1);
    }
}