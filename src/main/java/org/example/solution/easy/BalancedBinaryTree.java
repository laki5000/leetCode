package org.example.solution.easy;

import org.example.model.TreeNode;

// 110. Balanced Binary Tree https://leetcode.com/problems/balanced-binary-tree/
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return isBalancedHelper(root) != -1;
    }

    private int isBalancedHelper(TreeNode node) {
        if (node == null) return 0;

        int left = isBalancedHelper(node.left);
        if (left == -1) return -1;

        int right = isBalancedHelper(node.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }
}
