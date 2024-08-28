package easy;

public class Problem1470 {

    public int[] shuffle(int[] nums, int n) {
        int[] results = new int[n*2];

        for (int i=0; i<n; i++) { results[i*2] = nums[i]; }

        int j = 1;
        for (int i=n; i<n*2; i++) {
            results[j] = nums[i];
            j+=2;
        }

        return results;
    }

    public int[] shuffle1(int[] nums, int n) {
        int[] results = new int[n*2];

        int f=0, e=n, i=0;
        while (i < nums.length) {
            results[i++] = nums[f++];
            results[i++] = nums[e++];
        }

        return results;
    }
}
