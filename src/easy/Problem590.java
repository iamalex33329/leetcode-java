package easy;

import classes.Node;

import java.util.ArrayList;
import java.util.List;

public class Problem590 {

    private void handlePostorder(Node root, List<Integer> result) {

        if (root == null) return;

        if (root.children != null) {
            for (Node n : root.children) {
                handlePostorder(n, result);
            }

            result.add(root.val);
        }
    }

    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();

        handlePostorder(root, result);

        return result;
    }
}
