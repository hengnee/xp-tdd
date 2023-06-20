package com.test.tdd;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCalculator {
  public int add(String numbers) {
    if (numbers.length() == 0) {
      return 0;
    }
    String[] nums = numbers.split(",|\n");

    // validating the input
    List<Integer> negative = Stream.of(nums)
        .map(Integer::parseInt)
        .filter(n -> n < 0).collect(Collectors.toList());
    if (negative.size() > 0) {
      throw new IllegalArgumentException("negative number found");
    }

    return Stream.of(nums)
        .map(Integer::parseInt)
        .reduce(0, Integer::sum);
  }
}
