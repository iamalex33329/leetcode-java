package medium;


public class Problem1201 {

    // 最小公倍數
    private long lcm(long x, long y) {
        return x * y / gcd(x, y);
    }

    // 最大公因數
    private long gcd(long x, long y) {
        return (y == 0) ? x : gcd(y, x % y);
    }

    // 計算 x 時，會有多少個數被 a, b, c 整除
    private long count(long x, long a, long b, long c) {
        long ab = lcm(a, b);
        long ac = lcm(a, c);
        long bc = lcm(b, c);
        long abc = lcm(ab, c);
        return (x / a) + (x / b) + (x / c) - (x / ab) - (x / ac) - (x / bc) + (x / abc);
    }

    public int nthUglyNumber(int n, int a, int b, int c) {

        long low = 1;
        long high = Long.MAX_VALUE;

        while (low < high) {
            long mid = (low + high) / 2;

            // 如果 mid 能被 a, b, c 整除的數小於 n，代表範圍在 mid + 1 ~ high
            if (count(mid, a, b, c) < n) {
                low = mid + 1;
            }
            // 如果 mid 能被 a, b, c 整除的數大於 n，代表範圍在 low ~ mid
            else {
                high = mid;
            }
        }
        return (int) low;
    }
}
