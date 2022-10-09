package leetcode.trees;

import java.util.List;

abstract class TreeBaseTest {

    void printTreeAndAddToList(TreeNode root, boolean printRoot, List<Integer> list) {
        if (root == null) return;
        if (printRoot) {
            list.add(root.val);
            System.out.print(root.val);
        }
        if (root.left != null) {
            list.add(root.left.val);
            System.out.print(", ");
            System.out.print(root.left.val);
        }
        if (root.right != null) {
            list.add(root.right.val);
            System.out.print(", ");
            System.out.print(root.right.val);
        }
        printTreeAndAddToList(root.left, false, list);
        printTreeAndAddToList(root.right, false, list);
    }

    TreeNode generateBinarySearchTree(int... nums) {
        TreeNode root = null;

        for (int num : nums) {
            if (root == null) {
                root = new TreeNode(num);
            } else {
                set(root, num);
            }
        }
        return root;
    }

    TreeNode generateBinaryTreeByList(List<Integer> nums) {
        int idx = 0;
        TreeNode root = new TreeNode(nums.get(idx));
        set(root, nums, idx);

        return root;
    }

    private void set(TreeNode node, int val) {
        if (node == null) return;

        if (node.val < val) {
            if (node.right == null) {
                node.right = new TreeNode(val);
            } else {
                set(node.right, val);
            }
        } else {
            if (node.left == null) {
                node.left = new TreeNode(val);
            } else {
                set(node.left, val);
            }
        }
    }

    private void set(TreeNode node, List<Integer> nums, int idx) {
        if (node == null) return;

        int leftIdx = idx + idx + 1;
        int rightIdx = idx + idx + 2;

        if (nums.size() > leftIdx && nums.get(leftIdx) != null) {
            node.left = new TreeNode(nums.get(leftIdx));
            set(node.left, nums, leftIdx);
        }

        if (nums.size() > rightIdx && nums.get(rightIdx) != null) {
            node.right = new TreeNode(nums.get(rightIdx));
            set(node.right, nums, rightIdx);
        }
    }

}
