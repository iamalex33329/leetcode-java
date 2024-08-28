package medium;

public class Problem29 {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return ~dividend;
        return (int) ((long) dividend / (long) divisor);
    }
}
