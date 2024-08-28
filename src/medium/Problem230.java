package medium;

import classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem230 {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list, k);
        return list.get(k - 1);
    }

    private void inorder(TreeNode root, List<Integer> list, int k) {
        if (list.size() == k) return;
        if (root == null) return;

        inorder(root.left, list, k);
        list.add(root.val);
        inorder(root.right, list, k);
    }
}
