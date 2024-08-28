package easy;

public class Problem1672 {

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] acc : accounts) {
            int tmp = 0;
            for (int j : acc) { tmp += j; }
            max = Math.max(tmp, max);
        }
        return max;
    }
}
