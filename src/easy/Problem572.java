package easy;

import classes.TreeNode;

public class Problem572 {

    private boolean isSameTree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) { return true; }
        if (root == null || subRoot == null) { return false; }

        if (root.val == subRoot.val) {
            return isSameTree(root.left, subRoot.left) && isSubtree(root.right, subRoot.right);
        }
        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) { return true; }
        if (root == null || subRoot == null) { return false; }

        return isSameTree(root, subRoot) || isSubtree(root.left, subRoot)  || isSubtree(root.right, subRoot);
    }
}
