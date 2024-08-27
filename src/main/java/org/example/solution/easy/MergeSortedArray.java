package org.example.solution.easy;

// 88. Merge Sorted Array https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIndex = m - 1;
        int nIndex = n - 1;
        int sumIndex = m + n - 1;

        while (mIndex >= 0 && nIndex >= 0) {
            if (nums1[mIndex] > nums2[nIndex]) {
                nums1[sumIndex--] = nums1[mIndex--];
            } else {
                nums1[sumIndex--] = nums2[nIndex--];
            }
        }

        while (nIndex >= 0) {
            nums1[sumIndex--] = nums2[nIndex--];
        }
    }
}
