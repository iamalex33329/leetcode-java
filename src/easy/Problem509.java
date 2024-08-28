package easy;

public class Problem509 {

    /* DP version */
    public int fib(int n) {
        int[] f = new int[31];

        f[0] = 0; f[1] = 1;
        for (int i=2; i<n; i++) {
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }

    /* Recursive version */
    public int fib1(int n) {
        if (n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
}
