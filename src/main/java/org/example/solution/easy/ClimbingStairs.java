package org.example.solution.easy;

// 70. Climbing Stairs https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        int first = 1, second = 2;

        for (int i = 3; i <= n; i++) {
            int third = first + second;

            first = second;
            second = third;
        }

        return second;
    }
}
