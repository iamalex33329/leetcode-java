package medium;

public class Problem48 {

    public void rotate(int[][] matrix) {
        int tmpMatrix[][] = new int[matrix.length][matrix.length];

        for (int i=matrix.length-1; i>=0; i--) {
            for (int j=0; j<matrix.length; j++) {
                tmpMatrix[i][j] = matrix[matrix.length-1-j][i];
            }
        }

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                matrix[i][j] = tmpMatrix[i][j];
            }
        }
    }
}
