package hard;

import java.util.HashMap;

public class Problem149 {

    public int maxPoints(int[][] points) {
        // 如果點的數量小於3個，則直接返回點的個數，因為任意兩點可以組成一條直線
        if (points.length < 3) return points.length;

        int maxPoints = 0; // 初始化最大點數

        // 遍歷所有點
        for (int i = 0; i < points.length; i++) {
            HashMap<Double, Integer> slopes = new HashMap<>(); // 用來存儲斜率和對應的點的個數
            int duplicates = 1; // 重複點的個數，初始為1，因為當前點本身也算一個

            // 對除了當前點以外的其他點進行遍歷
            for (int j = 0; j < points.length; j++) {
                if (i != j) { // 當前點與自己不比較
                    int x1 = points[i][0], y1 = points[i][1]; // 當前點的座標
                    int x2 = points[j][0], y2 = points[j][1]; // 其他點的座標

                    // 計算兩點之間的斜率
                    double slope = (x1 == x2) ? Double.POSITIVE_INFINITY : (double) (y2 - y1) / (double) (x2 - x1);
                    slopes.put(slope, slopes.getOrDefault(slope, 0) + 1); // 將斜率放入HashMap中，並更新對應的點的個數
                }
            }

            int maxSlopeCount = 0;
            for (int count : slopes.values()) maxSlopeCount = Math.max(maxSlopeCount, count);
            maxPoints = Math.max(maxPoints, duplicates + maxSlopeCount);
        }

        return maxPoints; // 返回最大點數
    }
}