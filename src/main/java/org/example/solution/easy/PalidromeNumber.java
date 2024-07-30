package org.example.solution.easy;

// 9. Palindrome Number https://leetcode.com/problems/palindrome-number/
public class PalidromeNumber {
    public boolean isPalindrome(int x) {
        int xCopy = x;
        int invertedX = 0;

        if (x < 0) {
            return false;
        }

        while (xCopy != 0) {
            invertedX = invertedX * 10 + xCopy % 10;
            xCopy /= 10;
        }

        return invertedX == x;
    }
}
