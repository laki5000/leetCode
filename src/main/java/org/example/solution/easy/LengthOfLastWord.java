package org.example.solution.easy;

// 58. Length of Last Word https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int result = 0;

        for (int i = trimmed.length() - 1; i >= 0; i--) {
            if (trimmed.charAt(i) == ' ') {
                break;
            }

            result++;
        }

        return result;
    }
}
