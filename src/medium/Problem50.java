package medium;

public class Problem50 {

    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (x == 1) return 1;

        if (x == -1) {
            return (n%2 == 0) ? 1 : -1;
        }

        if (x > (float) (Integer.MAX_VALUE / 2)) {
            return 0;
        }

        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                return 0;
            } else {
                return myPow(1 / x, -n);
            }
        }

        if (n % 2 == 0) {
            return myPow(x*x, n/2);
        } else {
            return x * myPow(x * x, n / 2);
        }
    }
}
