package medium;

import java.util.Arrays;
import java.util.List;


public class Problem539 {

    public int findMinDifference(List<String> timePoints) {

        if (timePoints.size() > 1440) return 0;

        int[] timeInMinutes = new int[timePoints.size()];
        int totalMinutes = 0;

        for (int i = 0; i < timePoints.size(); i++) {
            totalMinutes = ((timePoints.get(i).charAt(0) - '0') * 10 + timePoints.get(i).charAt(1) - '0') * 60 +
                    (timePoints.get(i).charAt(3) - '0') * 10 + timePoints.get(i).charAt(4) - '0';

            timeInMinutes[i] = totalMinutes;
        }

        Arrays.sort(timeInMinutes);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < timeInMinutes.length; i++) {
            minDiff = Math.min(minDiff, timeInMinutes[i] - timeInMinutes[i - 1]);
        }

        int lastDiff = 1440 - timeInMinutes[timeInMinutes.length - 1] + timeInMinutes[0];
        minDiff = Math.min(minDiff, lastDiff);

        return minDiff;
    }
}
