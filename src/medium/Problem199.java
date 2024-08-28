package medium;

import classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }

    public void rightView(TreeNode curr, List<Integer> result, int currDepth){
        if (curr == null) { return; }

        // 如果當前的深度跟result的長度一樣，代表這層還沒有數字
        if (currDepth == result.size()) { result.add(curr.val); }

        // 因為要從右邊的角度來看，所以先從右邊遞迴
        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);
    }
}
