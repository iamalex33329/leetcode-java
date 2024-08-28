package medium; 

import java.util.Arrays;

public class Problem1143 {

    public int longestCommonSubsequence(String text1, String text2) {

        int[][] grid = new int[text1.length() + 1][text2.length() + 1];

        for (int i=0; i<grid.length; i++) { grid[i][0] = 0; }
        Arrays.fill(grid[0], 0);

        for (int i=1; i<grid.length; i++) {
            for (int j=1; j<grid[0].length; j++) {
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    grid[i][j] = grid[i-1][j-1] + 1;
                } else {
                    grid[i][j] = Math.max(grid[i-1][j], grid[i][j-1]);
                }
            }
        }

        return grid[text1.length()][text2.length()];
    }
}
