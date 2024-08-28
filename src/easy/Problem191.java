package easy;

public class Problem191 {

    public int hammingWeight(int n) {
        int weight = 0;

        boolean isNegative = false;
        if (n < 0) {
            n = ~n;
            isNegative = true;
        }

        while (n > 0) {
            if ((n & 1) == 1) {
                weight++;
            }
            n >>= 1;
        }

        return (isNegative) ? 32 - weight : weight;
    }

}
