package com.test.tdd;

public class StringCalculator {
  public int add(String numbers) {
    if (numbers.length() == 1) {
      return Integer.parseInt(numbers);
    }
    return 0;
  }
}
