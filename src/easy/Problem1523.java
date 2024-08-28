package easy;

public class Problem1523 {

    public int countOdds(int low, int high) {

        int result = 0;
        for (int i=low; i<=high; i++) result += i & 1;

        return result;
    }

    public int countOdds1(int low, int high) {
        if (low % 2 == 0 && high % 2 == 0) return (high - low) / 2;

        return (high - low) / 2 + 1;
    }
}
