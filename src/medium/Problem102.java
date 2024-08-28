package medium;

import classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem102 {

    List<List<Integer>> results = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        bfs(root, 0, results);
        return results;
    }

    private void bfs(TreeNode node, int level, List<List<Integer>> list) {
        if (node == null) return;

        if (list.size() <= level) { list.add(new ArrayList<>()); }

        list.get(level).add(node.val);

        level++;

        bfs(node.left, level, list);
        bfs(node.right, level, list);
    }
}
