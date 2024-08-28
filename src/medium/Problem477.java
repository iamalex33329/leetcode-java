package medium;

public class Problem477 {

    public int totalHammingDistance(int[] nums) {
        int totalDist = 0;
        int n = nums.length;

        int count1, count0;

        for (int i=0; i<32; i++) {
            count1 = 0;
            for (int num : nums) { count1 += (num >> i) & 1; }

            count0 = n - count1;
            totalDist += count1 * count0;
        }

        return totalDist;
    }
}
