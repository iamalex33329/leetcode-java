package easy;

public class Problem342 {

    public boolean isPowerOfFour(int n) {
        for (int i=0; i<30; i++) {
            if (n == 1 << i) return true;
        }

        return false;
    }
}
