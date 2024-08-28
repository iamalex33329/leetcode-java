package easy;

import classes.TreeNode;

public class Problem100 {

    /* 利用遞迴檢查子樹的root以及左右子樹是否相同 */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right) ;
    }
}
