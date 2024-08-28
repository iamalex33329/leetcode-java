package medium;

import classes.TreeNode;

public class Problem623 {

    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if (depth == 1) { return new TreeNode(val, root, null); }

        addRow(root, val, 1, depth);

        return root;
    }

    private void addRow(TreeNode root, int val, int currentD, int targetD) {
        if (root == null) return;

        if (targetD - currentD == 1) {
            TreeNode left = new TreeNode(val, root.left, null);
            TreeNode right = new TreeNode(val, null, root.right);

            root.left = left;
            root.right = right;
            return;
        }

        addRow(root.left, val, currentD+1, targetD);
        addRow(root.right, val, currentD+1, targetD);
    }
}
