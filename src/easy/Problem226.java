package easy;

import classes.TreeNode;

public class Problem226 {

    public TreeNode invertTree(TreeNode root) {
        TreeNode result = new TreeNode();

        if (root != null) {
            result.val = root.val;
            result.left = invertTree(root.right);
            result.right = invertTree(root.left);
        } else { return null; }

        return result;
    }
}
