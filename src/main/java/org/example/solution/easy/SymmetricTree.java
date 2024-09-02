package org.example.solution.easy;

import org.example.model.TreeNode;

// 101. Symmetric Tree https://leetcode.com/problems/symmetric-tree/
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        return (right.val == left.val)
                && isSymmetric(left.left, right.right)
                && isSymmetric(left.right, right.left);
    }
}
