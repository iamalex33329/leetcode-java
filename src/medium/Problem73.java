package medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem73 {

    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> zeroPositions = new ArrayList<>();

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == 0) { zeroPositions.add(i); zeroPositions.add(j); }
            }
        }

        for (int i=0; i<zeroPositions.size(); i+=2) {
            Arrays.fill(matrix[zeroPositions.get(i)], 0);
            for (int m=0; m<matrix.length; m++) { matrix[m][zeroPositions.get(i+1)] = 0; }
        }
    }
}
