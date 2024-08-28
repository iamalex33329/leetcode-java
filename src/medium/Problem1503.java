package medium;

public class Problem1503 {
    public int getLastMoment(int n, int[] left, int[] right) {
        int t = 0;

        for (int l: left) t = l > t ? l : t;
        for (int r: right) t = n - r > t ? n - r : t;

        return t;
    }
}
