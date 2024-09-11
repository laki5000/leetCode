package org.example.solution.easy;

import org.example.model.TreeNode;

// 112. Path Sum https://leetcode.com/problems/path-sum/
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        if (root.left == null && root.right == null && root.val == targetSum) return true;

        int remaining = targetSum - root.val;

        return hasPathSum(root.left, remaining) || hasPathSum(root.right, remaining);
    }
}
