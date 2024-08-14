package org.example.solution.easy;

// 67. Add Binary https://leetcode.com/problems/add-binary/
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int carry = 0;

        while (aLength >= 0 || bLength >= 0 || carry != 0) {
            int sum = carry;

            if (aLength >= 0) {
                sum += a.charAt(aLength--) - '0';
            }

            if (bLength >= 0) {
                sum += b.charAt(bLength--) - '0';
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }
}
