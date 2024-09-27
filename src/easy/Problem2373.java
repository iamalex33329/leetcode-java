package easy;

public class Problem2373 {

    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n-2][n-2];

        for (int i=0; i < n-2; i++) {
            for (int j=0; j < n-2; j++) {
                int maxValue = findMaxIn3x3(grid, i, j);
                result[i][j] = maxValue;
            }
        }
        return result;
    }

    private int findMaxIn3x3(int[][] grid, int row, int col) {
        return Math.max(
                Math.max(grid[row][col], grid[row][col + 1]),
                Math.max(grid[row][col + 2],
                        Math.max(
                                Math.max(grid[row + 1][col], grid[row + 1][col + 1]),
                                Math.max(grid[row + 1][col + 2],
                                        Math.max(
                                                Math.max(grid[row + 2][col], grid[row + 2][col + 1]),
                                                grid[row + 2][col + 2]
                                        ))
                        ))
        );
    }

    public int[][] largestLocal2(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n - 2][n - 2];

        // 取得前兩行的局部最大值
        int[] topRow1 = localMax(grid[0]);
        int[] topRow2 = localMax(grid[1]);

        // 從第三行開始遍歷網格
        for (int i=2; i<n; i++) {
            int[] currentRow = localMax(grid[i]); // 獲取當前行的局部最大值
            result[i-2] = localMax(topRow1, topRow2, currentRow); // 計算當前局部最大值

            topRow1 = topRow2;
            topRow2 = currentRow;
        }

        return result;
    }

    // 計算單行的局部最大值
    private int[] localMax(int[] row) {
        int n = row.length;
        int[] localMaxValues = new int[n - 2];

        int p1 = row[0]; // 第一個元素
        int p2 = row[1]; // 第二個元素

        for (int c=2; c<n; c++) {
            localMaxValues[c-2] = Math.max(row[c], Math.max(p1, p2));
            p1 = p2;
            p2 = row[c];
        }
        return localMaxValues;
    }

    // 計算三行的局部最大值的總最大值
    private int[] localMax(int[] v1, int[] v2, int[] v3) {
        int n = v1.length;
        int[] combinedMax = new int[n];

        for (int i=0; i<n; i++) {
            combinedMax[i] = Math.max(v1[i], Math.max(v2[i], v3[i])); // 計算統整好各行最大值的總最大值
        }
        return combinedMax;
    }
}
