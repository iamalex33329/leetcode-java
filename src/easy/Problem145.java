package easy; 

import classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem145 {

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
        }
        return list;
    }
}
