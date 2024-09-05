package medium;

import java.util.Arrays;

public class Problem2028 {

    public int[] missingRolls(int[] rolls, int mean, int n) {

        int[] result = new int[n];

        int currentSum = 0;
        for (int i : rolls) currentSum += i;

        int missingSum = mean * (n + rolls.length) - currentSum;
        if (missingSum > 6*n || missingSum < n) return new int[]{};

        int missingAvg = missingSum / n;
        int remainder = missingSum % n;

        for (int i = 0; i < n; i++) {
            result[i] = i < remainder ? missingAvg + 1 : missingAvg;
        }

        return result;
    }
}
