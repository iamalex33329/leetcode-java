package easy;

public class Problem2220 {

    public int minBitFlips(int start, int goal) {

        int result = 0;

        for (int i=0; i<31; i++) {
            if ((start ^ goal) % 2 == 1) result++;

            start >>= 1;
            goal >>= 1;
        }
        return result;
    }
}
