package easy;

public class Problem190 {

    public int reverseBits(int n) {
        int result = 0;
        result = n & 1;

        for (int i=0; i<31; i++) {
            result <<= 1;
            n >>= 1;

            if ((n & 1) == 1) { result ^= 1; }
        }
        return result >> 1;
    }
}
