package com.test.tdd;

public class StringReverser {
  public String reverseString(String str) {
    if (str == null) {
      throw new IllegalArgumentException("input should not be null");
    }
    return new StringBuilder(str).reverse().toString();
  }
}
