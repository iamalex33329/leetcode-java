package easy;

public class Problem2022 {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) return new int[0][0];

        int[][] result = new int[m][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                result[j][i] = original[i + j*n];
            }
        }

        return result;
    }
}
