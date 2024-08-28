package medium;

import classes.TreeNode;

public class Problem105 {

    private int preorderPos;
    private int inorderPos;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderPos = 0;
        inorderPos = 0;
        return buildTree(3001, preorder, inorder);
    }

    private TreeNode buildTree(int valToStop, int[] preorder, int[] inorder) {
        if (inorderPos == inorder.length || inorder[inorderPos] == valToStop) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[preorderPos++]);
        node.left = buildTree(node.val, preorder, inorder);
        inorderPos++;
        node.right = buildTree(valToStop, preorder, inorder);
        return node;
    }
}
