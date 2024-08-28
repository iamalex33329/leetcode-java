package medium;

public class Problem62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(7, 3));
    }

    public static int uniquePaths(int m, int n) {
        if (m == 1 && n == 1) { return 1; }
        if (m == 1 || n == 1) { return 1; }

        return uniquePaths(m-1, n) + uniquePaths(m, n-1);
    }

    /* DP Solution */
    public static int uniquePaths1(int m, int n) {
        int[][] grid = new int[m][n];

        for (int i=0; i<n; i++) { grid[0][i] = 1; }
        for (int i=0; i<m; i++) { grid[i][0] = 1; }

        for (int i=1; i<m; i++) {
            for (int j=1; j<n; j++) {
                grid[i][j] = grid[i-1][j] + grid[i][j-1];
            }
        }
        return grid[m-1][n-1];
    }
}
