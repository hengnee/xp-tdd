package com.test.tdd;

public class StringCalculator {
  public int add(String numbers) {
    if (numbers.length() == 0) {
      return 0;
    }

    if (numbers.length() == 1) {
      return Integer.parseInt(numbers);
    }
    int sum = 0;
    String[] nums = numbers.split(",");
    for(String n: nums) {
      sum = sum + Integer.parseInt(n);
    }
    return sum;
  }
}
