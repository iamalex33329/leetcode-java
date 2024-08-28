package easy; 

import classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem144 {

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return list;
    }
}
