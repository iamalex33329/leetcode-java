package medium;

import classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem98 {

    public boolean isValidBST(TreeNode root) {
        inorder(root);
        for (int i=0; i<list.size()-1; i++) {
            if (list.get(i) > list.get(i+1)) { return false; }
        }
        return true;
    }

    List<Integer> list = new ArrayList<>();
    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    private int minValue = Integer.MIN_VALUE;
    public boolean isValidBST1(TreeNode root) {
        if (root == null) return true;

        if (!isValidBST(root.left)) return false;

        if (root.val <= minValue) return false;
        minValue = root.val;

        if (!isValidBST(root.right)) return false;

        return true;
    }
}
