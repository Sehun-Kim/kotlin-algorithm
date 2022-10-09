package leetcode.trees;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int l = findDepth(root.left, 1);
        int r = findDepth(root.right, 1);

        return Math.max(l, r);
    }

    private int findDepth(TreeNode node, int depth) {
        if (node == null)
            return depth;

        int l = findDepth(node.left, depth + 1);
        int r = findDepth(node.right, depth + 1);

        return Math.max(l, r);
    }

}
