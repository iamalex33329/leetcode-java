package medium;

public class Problem96 {

    public int numTrees(int n) {
        if (n <= 1) {
            return 1;
        }

        int count = 0;
        for (int i=1; i<=n; i++) {
            count += numTrees(i - 1) * numTrees(n - i);
        }

        return count;
    }

    public int numTrees1(int n) {
        int[] dp = new int[n + 1];

        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }

        return dp[n];
    }
}
