package easy;

public class Problem69 {

    public int mySqrt(int x) {
        if (x == 1) return 1;

        int i = 1;

        while (i <= (x/i)) { i++; }
        return i - 1;
    }
}
