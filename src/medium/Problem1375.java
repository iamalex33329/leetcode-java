package medium;

public class Problem1375 {
    public int numTimesAllBlue(int[] flips) {
        int expectSum = 0, currSum = 0;
        int result = 0;

        for (int i=0; i<flips.length; i++) {
            expectSum += i+1;
            currSum += flips[i];

            if (expectSum == currSum) result++;
        }

        return result;
    }
}
