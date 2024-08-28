package medium;

public class Problem53 {

    public int maxSubArray(int[] nums) {
        int maxSumHere = nums[0];
        int maxSorFar = nums[0];
        for (int i = 1; i < nums.length; i++){
            int num = nums[i];
            maxSumHere = Math.max(num, maxSumHere + num);
            maxSorFar = Math.max(maxSorFar, maxSumHere);
        }
        return maxSorFar;
    }

    // [-2,1,-3,4,-1,2,1,-5,4]
    public int maxSubArray1(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;

        for (int i : nums){
            sum += nums[i];
            max = Math.max(sum, max);

            if(sum < 0) sum = 0;
        }
        return max;
    }
}
