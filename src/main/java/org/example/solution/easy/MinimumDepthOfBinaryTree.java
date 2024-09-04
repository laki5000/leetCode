package org.example.solution.easy;

import org.example.model.TreeNode;

// 111. Minimum Depth of Binary Tree https://leetcode.com/problems/minimum-depth-of-binary-tree/
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (root.left == null || root.right == null) {
            return Math.max(left, right) + 1;
        }

        return Math.min(left, right) + 1;
    }
}
