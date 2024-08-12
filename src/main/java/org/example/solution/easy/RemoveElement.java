package org.example.solution.easy;

// 27. Remove Element https://leetcode.com/problems/remove-element/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                for (int j = i; j < length - 1; j ++) {
                    int tmp = nums[j];

                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }

                length--;
                i--;
            }
        }

        return length;
    }
}
