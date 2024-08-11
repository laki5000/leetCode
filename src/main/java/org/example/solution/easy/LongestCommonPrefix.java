package org.example.solution.easy;

// 14. Longest Common Prefix https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        StringBuilder sb = new StringBuilder();

        if (length == 0) {
            return "";
        }

        if (length == 1) {
            return strs[0];
        }

        int firstWordLength = strs[0].length();

        for (int i = 0; i < firstWordLength; i++) {
            for (int j = 1; j < length; j++) {
                int wordLength = strs[j].length();

                if (i > wordLength - 1 || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return sb.toString();
                }
            }

            sb.append(strs[0].charAt(i));
        }

        return sb.toString();
    }
}
