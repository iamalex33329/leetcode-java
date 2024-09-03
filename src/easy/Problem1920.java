package easy;

public class Problem1920 {

    public int[] buildArray(int[] nums) {

        int[] result = new int[nums.length];

        for (int i=0; i<nums.length; i++) result[i] = nums[nums[i]];

        System.gc();

        return result;
    }
}
