package org.example.solution.easy;

import java.util.ArrayList;
import java.util.List;

// 119. Pascal's Triangle II https://leetcode.com/problems/pascals-triangle-ii/
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> line = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    line.add(1);
                } else {
                    line.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }

            result.add(line);
        }

        return result.get(rowIndex);
    }
}
