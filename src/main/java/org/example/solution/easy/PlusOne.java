package org.example.solution.easy;

// 66. Plus One https://leetcode.com/problems/plus-one/
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length;

        int carry = 1;

        for (int i = length - 1; i >= 0; i--) {
            if (carry == 0) {
                return digits;
            }

            int sum = digits[i] + carry;

            if (sum == 10) {
                digits[i] = 0;

                if (i == 0) {
                    return createNewArrayWithBiggerSize(digits, length);
                }
            } else {
                digits[i] = sum;
                carry = 0;
            }
        }

        return digits;
    }

    private int[] createNewArrayWithBiggerSize(int[] digits, int length) {
        int[] result = new int[length + 1];

        result[0] = 1;

        for (int i = 1; i < length; i++) {
            result[i + 1] = digits[i];
        }

        return result;
    }
}
