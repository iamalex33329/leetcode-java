package easy; 

import classes.TreeNode;

public class Problem222 {

    public int countNodes(TreeNode root) {

        if (root == null) return 0;

        int left_count = countNodes(root.left);
        int right_count = countNodes(root.right);

        return left_count + right_count + 1;
    }
}
