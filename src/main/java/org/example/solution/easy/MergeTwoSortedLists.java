package org.example.solution.easy;

import org.example.model.ListNode;

// 21. Merge Two Sorted Lists https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
        }

        return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
    }
}
