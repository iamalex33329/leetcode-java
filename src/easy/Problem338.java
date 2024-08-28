package easy;

public class Problem338 {

    public int[] countBits(int n) {
        int[] results = new int[n+1];
        for (int i=0; i<=n; i++) { results[i] = hammingWeight(i); }
        return results;
    }

    public int hammingWeight(int n) {
        int w = 0;
        while (n > 0) {
            if ((n & 1) == 1) { w++; }
            n >>= 1;
        }
        return w;
    }

    /* 讚讚的方法 */
    public int[] countBits1(int n) {
        int[] results = new int[n+1];
        for (int i=0; i<=n; i++) { results[i] = results[i >> 1] + (i & 1); }
        return results;
    }
}
