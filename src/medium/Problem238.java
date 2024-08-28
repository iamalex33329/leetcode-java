package medium;

public class Problem238 {

    /* 暴力解 O(n^2) */
    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            results[i] = 1;
            for (int j=0; j<nums.length; j++) {
                if (i != j) { results[i] *= nums[j]; }
            }
        }
        return results;
    }

    public int[] productExceptSelf1(int[] nums) {
        int[] leftProduct  = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int[] results = new int[nums.length];

        leftProduct[0] = nums[0];
        for (int i=1; i<nums.length; i++) { leftProduct[i] = leftProduct[i-1] * nums[i]; }

        rightProduct[nums.length-1] = nums[nums.length-1];
        for (int i=nums.length-2; i>=0; i--) { rightProduct[i] = rightProduct[i+1] * nums[i]; }

        for (int i=0; i<nums.length; i++) {
            if (i == 0) {
                results[i] = rightProduct[i+1];
            } else if (i == nums.length-1) {
                results[i] = leftProduct[i-1];
            } else {
                results[i] = leftProduct[i-1] * rightProduct[i+1];
            }
        }
        return results;
    }
}
