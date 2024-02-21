package com.leetcode.array;

public class Run {

  public static void main(String[] args) {
    BuyOrSellStock buyOrSellStock = new BuyOrSellStock();
    int[] stock = {7, 1, 5, 3, 6, 4};

    int maxProfit = buyOrSellStock.getMaxProfit(stock);
    System.out.println(maxProfit);
  }

}
