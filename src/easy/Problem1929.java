package easy;

public class Problem1929 {

    public int[] getConcatenation(int[] nums) {
        int[] newNums = new int[nums.length * 2];

        for (int i=0; i<nums.length; i++) {
            newNums[i] = nums[i];
            newNums[i+nums.length] = nums[i];
        }

        return newNums;
    }

    public int[] getConcatenation1(int[] nums) {
        int[] newNums = new int[nums.length * 2];

        System.arraycopy(nums, 0, newNums, 0, nums.length);
        System.arraycopy(nums, nums.length, newNums, 0, nums.length);

        return newNums;
    }
}
