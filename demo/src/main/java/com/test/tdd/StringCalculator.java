package com.test.tdd;

import java.util.stream.Stream;

public class StringCalculator {
  public int add(String numbers) {
    if (numbers.length() == 0) {
      return 0;
    }

    String[] nums = numbers.split(",");
    return Stream.of(nums)
        .map(Integer::parseInt)
        .reduce(0, Integer::sum);
  }
}
