package medium;

import java.util.ArrayList;
import java.util.List;

public class Problem54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        // 用來儲存走過的路
        int rowBegin = 0, rowEnd = matrix.length-1;
        int colBegin = 0, colEnd = matrix[0].length-1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // 往右找
            for (int i=colBegin; i<=colEnd; i++) { list.add(matrix[rowBegin][i]); }
            rowBegin++;
            // 往下找
            for (int i=rowBegin; i<=rowEnd; i++) { list.add(matrix[i][colEnd]); }
            colEnd--;
            // 往左找
            if (rowBegin <= rowEnd) {
                for (int i=colEnd; i>=colBegin; i--) { list.add(matrix[rowEnd][i]); }
                rowEnd--;
            }
            // 往上找
            if (colBegin <= colEnd) {
                for (int i=rowEnd; i>=rowBegin; i--) { list.add(matrix[i][colBegin]); }
                colBegin++;
            }
        }
        return list;
    }
}
