package medium;

import classes.TreeNode;


public class Problem1302 {

    private int result = 0;
    private int depth = 0;

    public int deepestLeavesSum(TreeNode root) {

        depth = getDepth(root);

        getDeepestSum(root, 1);

        return result;
    }

    private void getDeepestSum(TreeNode root, int treeDepth) {
        if (root == null) return;

        getDeepestSum(root.left, treeDepth + 1);
        getDeepestSum(root.right, treeDepth + 1);

        if (treeDepth == depth) {
            result += root.val;
        }
    }

    private int getDepth(TreeNode root) {
        if (root == null) return 0;

        int left = getDepth(root.left);
        int right = getDepth(root.right);

        return Math.max(left, right) + 1;
    }
}
