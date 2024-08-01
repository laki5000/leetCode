package org.example.solution.easy;

// 1. Two Sum https://leetcode.com/problems/two-sum/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;

        for (int i = 1; i < length; i++) {
            for (int j = i; j < length; j++) {
                int left = j - i;

                if (nums[left] + nums[j] == target) {
                    return new int[] {left, j};
                }
            }
        }

        return new int[] {};
    }
}
