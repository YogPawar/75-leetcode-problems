package com.leetcode.array;

import java.util.Arrays;

public class RemoveDuplicateMoreThanTwo {

  private static int removeDuplicates(int[] nums) {
    int length = nums.length;
    if (length <= 2) {
      return length;
    }
    int j = 2;
    for (int i = 2; i < length; i++) {
      if (nums[i] != nums[j - 2]) {
        nums[j] = nums[i];
        j++;
      }
    }
    System.out.println(Arrays.toString(nums));
    return j;
  }


  public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[]{0, 1, 1, 1, 1, 1, 2, 3, 3}));

  }

}
