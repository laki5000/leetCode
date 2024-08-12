package org.example.solution.easy;

// 35. Search Insert Position https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return length;
    }
}
