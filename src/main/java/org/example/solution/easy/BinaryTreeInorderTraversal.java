package org.example.solution.easy;

import org.example.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

// 94. Binary Tree Inorder Traversal https://leetcode.com/problems/binary-tree-inorder-traversal/
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        inorderHelper(root, result);

        return result;
    }

    private void inorderHelper(TreeNode root, List<Integer> result) {
        if (root != null) {
            inorderHelper(root.left, result);

            result.add(root.val);

            inorderHelper(root.right, result);
        }
    }
}
