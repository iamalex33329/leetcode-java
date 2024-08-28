package easy;

import classes.TreeNode;

public class Problem104 {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left_height = maxDepth(root.left) + 1;
        int right_height = maxDepth(root.right) + 1;

        return Math.max(left_height, right_height);
    }
}
