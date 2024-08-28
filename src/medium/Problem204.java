package medium;

public class Problem204 {

    public int countPrimes(int n) {
        // 建立一個 n size 的表格（起初每個值都沒看過，都是 false）
        boolean[] seen = new boolean[n];

        int ans = 0;
        for (int i=2; i<n; i++) {
            if (seen[i]) continue;

            ans += 1;
            for (int j=i*i; j<n; j+=i) seen[j] = true;
        }
        return ans;
    }
}
