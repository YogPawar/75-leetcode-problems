package com.leetcode.string;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

  private static boolean validParenthesis(String paranthesis) {
    HashMap<Character, Character> map = new HashMap<>();
    map.put(')', '(');
    map.put(']', '[');
    map.put('}', '{');
    map.put('>', '<');
    Stack<Character> charStack = new Stack<>();
    for (int i = 0; i < paranthesis.length(); i++) {
      Character currentParenthesis = paranthesis.charAt(i); //{
      if (map.containsKey(currentParenthesis)) {
        Character stackChar = charStack.size() != 0 ? charStack.pop() : '#';
        if (stackChar != map.get(currentParenthesis)) {
          return false;
        }
      } else {
        charStack.push(currentParenthesis);
      }
    }
    return charStack.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println(validParenthesis("{[()]}"));
  }

}
