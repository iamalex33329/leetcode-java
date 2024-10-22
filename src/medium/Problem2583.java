package medium;

import classes.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class Problem2583 {

    private HashMap<Integer, Long> level_sum = new HashMap<>();
    private PriorityQueue<Long> pq = new PriorityQueue<>((a, b) -> Long.compare(b, a));

    public long kthLargestLevelSum(TreeNode root, int k) {

        postorder(root, 1);

        int target = k;
        for (long v : level_sum.values()) {
            if (--target == 0) return v;
            pq.offer(v);
        }

        if (pq.size() < k) return -1;

        long result = 0;
        for (int i = 0; i < k; i++) result = pq.remove();

        return result;
    }

    private void postorder(TreeNode root, int level) {
        if (root == null) return;

        level_sum.put(level, level_sum.getOrDefault(level, 0L) + root.val);
        postorder(root.left, level + 1);
        postorder(root.right, level + 1);
    }

    public long kthLargestLevelSum2(TreeNode root, int k) {
        if (root == null) return -1;

        PriorityQueue<Long> pq = new PriorityQueue<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            long levelSum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelSum += node.val;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            pq.offer(levelSum);

            if (pq.size() > k) pq.poll();
        }

        if (pq.size() < k) return -1;

        return pq.poll();
    }
}
