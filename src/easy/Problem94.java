package easy;

import classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem94 {

    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }
}
