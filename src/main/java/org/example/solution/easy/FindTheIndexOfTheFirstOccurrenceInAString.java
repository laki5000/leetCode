package org.example.solution.easy;

// 28. Find the Index of the First Occurrence in a String
// https://leetcode.com/problems/implement-strstr/
public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        int result = -1;
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i < haystackLength - needleLength + 1; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }

        return result;
    }
}
