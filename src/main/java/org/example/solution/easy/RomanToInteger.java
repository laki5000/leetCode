package org.example.solution.easy;

import java.util.Map;

// 13. Roman to Integer https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {
    public int romanToInt(String s) {
        if (s == null) {
            return 0;
        }
        int lenght = s.length();
        int result = 0;
        int prev = 0;

        for (int i = lenght - 1; i >= 0; i--) {
            int current = convertToInt(s.charAt(i));

            if (current < prev) {
                result -= current;
            } else {
                result += current;
            }

            prev = current;
        }

        return result;
    }

    private int convertToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
