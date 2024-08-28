package easy;

public class Problem70 {

    public int climbStairs(int n) {
        int[] steps = new int[n+1];
        steps[1] = 1; steps[2] = 2;

        if (n <= 2) { return n; }

        for (int i=3; i<=n; i++) { steps[i] = steps[i-1] + steps[i-2]; }

        return steps[n];
    }
}
