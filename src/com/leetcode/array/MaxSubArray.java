package com.leetcode.array;

public class MaxSubArray {

  private static int maxSubArray(int[] array) {
    int current = array[0];
    int max = array[0];

    for (int i = 1; i < array.length; i++) {
      current = Math.max(array[i], array[i] + current);
      max = Math.max(max, current);
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }

}
