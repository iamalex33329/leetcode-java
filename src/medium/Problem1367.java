package medium;

import classes.ListNode;
import classes.TreeNode;

import java.util.ArrayList;


public class Problem1367 {

    private ArrayList<String> ancestors = new ArrayList<>();

    private void preOrder(TreeNode root, String ancestor) {
        if (root == null) {
            ancestors.add(ancestor);
            return;
        }
        ancestor += root.val + ',';
        preOrder(root.left, ancestor);
        preOrder(root.right, ancestor);
    }

    public boolean isSubPath(ListNode head, TreeNode root) {

        preOrder(root, "");

        StringBuilder headString = new StringBuilder();
        while (head != null) {
            headString.append(head.val + ',');
            head = head.next;
        }

        for (String ancestor : ancestors) {
            if (ancestor.contains(headString.toString())) return true;
        }
        return false;
    }

    boolean dfs(ListNode head, ListNode cur, TreeNode root) {
        if (cur == null) return true;
        if (root == null) return false;

        if (cur.val == root.val) cur = cur.next;
        else if (head.val == root.val) head = head.next;
        else cur = head;

        return dfs(head, cur, root.left) || dfs(head, cur, root.right);
    }

    public boolean isSubPath2(ListNode head, TreeNode root) {
        return dfs(head, head, root);
    }
}
