package medium;

import classes.ListNode;


public class Problem2326 {

    public int[][] spiralMatrix(int m, int n, ListNode head) {

        int[][] matrix = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) matrix[i][j] = -1;
        }

        int top = 0, bottom = m - 1, left = 0, right = n - 1;  // 初始化邊界
        ListNode currentNode = head;  // 開始於鏈結串列的頭


        while (currentNode != null) {
            // 向右移動，從 left 到 right
            for (int i=left; i<=right && currentNode!=null; i++) {
                matrix[top][i] = currentNode.val;
                currentNode = currentNode.next;
            }
            top++;  // 縮小上邊界

            // 向下移動，從 top 到 bottom
            for (int i=top; i<=bottom && currentNode!=null; i++) {
                matrix[i][right] = currentNode.val;
                currentNode = currentNode.next;
            }
            right--;  // 縮小右邊界

            // 向左移動，從 right 到 left
            for (int i=right; i>=left && currentNode!=null; i--) {
                matrix[bottom][i] = currentNode.val;
                currentNode = currentNode.next;
            }
            bottom--;  // 縮小下邊界

            // 向上移動，從 bottom 到 top
            for (int i=bottom; i>=top && currentNode!=null; i--) {
                matrix[i][left] = currentNode.val;
                currentNode = currentNode.next;
            }
            left++;  // 縮小左邊界
        }
        return matrix;
    }
}
