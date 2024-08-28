package easy;

public class Problem1646 {

    public int getMaximumGenerated(int n) {
        if (n < 2) return n;

        int[] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1;

        for (int i=1; (2*i)+1<=n; i++){
            dp[2*i] = dp[i];
            dp[2*i + 1] = dp[i] + dp[i+1];
        }

        int max = Integer.MIN_VALUE;
        for (int i: dp) max = Math.max(i, max);

        return max;
    }
}
