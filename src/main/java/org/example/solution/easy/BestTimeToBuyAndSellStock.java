package org.example.solution.easy;

// 121. Best Time to Buy and Sell Stock https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i : prices) {
            if (i < minPrice) {
                minPrice = i;
            } else if (i - minPrice > maxProfit) {
                maxProfit = i - minPrice;
            }
        }

        return maxProfit;
    }
}
