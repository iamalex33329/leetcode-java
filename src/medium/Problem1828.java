package medium;

import java.util.Arrays;

public class Problem1828 {

    public int[] countPoints(int[][] points, int[][] queries) {

        int[] result = new int[queries.length];

        Arrays.parallelSetAll(result , i -> {

            int cx = queries[i][0];
            int cy = queries[i][1];
            int r  = queries[i][2];

            int count = 0;

            for (int[] point : points) {
                int dx = point[0] - cx;
                int dy = point[1] - cy;

                if (dx * dx + dy * dy <= r * r) count++;
            }

            return count;
        });

        return result;
    }
}
