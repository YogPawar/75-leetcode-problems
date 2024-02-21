package com.leetcode.array;

import java.util.HashSet;

public class FindDuplicate {

  public boolean findDuplicate(int[] stock) {
    HashSet<Integer> uniqueElement = new HashSet<>();
    for (int i = 0; i < stock.length; i++) {
      if (!uniqueElement.add(stock[i])) {
        return true;
      }
    }
    return false;
  }
}
