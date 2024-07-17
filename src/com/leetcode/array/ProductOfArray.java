package com.leetcode.array;

import java.util.Arrays;

public class ProductOfArray {

  public int[] productOfArray(int[] nums) {
    int[] prefixProduct = new int[nums.length];
    prefixProduct[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      prefixProduct[i] = nums[i - 1] * nums[i]; //store the product of all element expect self
    }
    int suffixProduct = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      prefixProduct[i] = prefixProduct[i] * suffixProduct;
      suffixProduct = suffixProduct * nums[i];
    }

    return prefixProduct;
  }

}
