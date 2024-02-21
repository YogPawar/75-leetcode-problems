package com.leetcode.array;

public class BuyOrSellStock {

  public int getMaxProfit(int[] stock) {
    int maxProfit = 0;
    int left = 0;
    for (int right = 1; right < stock.length; right++) {
      if (stock[left] < stock[right]) {
        int currentProf = stock[right] - stock[left];
        maxProfit = Math.max(maxProfit, currentProf);
      } else {
        left = right;
      }
    }

    return maxProfit;
  }
}
