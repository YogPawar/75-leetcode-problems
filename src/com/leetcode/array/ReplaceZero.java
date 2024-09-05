package com.leetcode.array;

import java.util.Arrays;

public class ReplaceZero {

  private static void replaceZero(int[] nums) {
    int zeroIndex = 0;
    for (int nonZeroIndex = 0; nonZeroIndex < nums.length; nonZeroIndex++) {
      if (nums[nonZeroIndex] != 0) {
        swap(nums, zeroIndex, nonZeroIndex);
        zeroIndex++;
      }
    }
  }

  private static void swap(int[] nums, int zeroIndex, int nonZeroIndex) {
    int temp = nums[zeroIndex];
    nums[zeroIndex] = nums[nonZeroIndex];
    nums[nonZeroIndex] = temp;
  }

  public static void main(String[] args) {
    int[] nums = {0,1,0,3,12};
    replaceZero(nums);
    System.out.println(Arrays.toString(nums));
  }

}
