package com.test.tdd;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCalculator {

  private final Clock clock;
  private final RemoteApi api;

  public StringCalculator(Clock clock, RemoteApi api) {
    this.clock = clock;
    this.api = api;
  }

  public int add(String numbers) {

//    RemoteApi api = new RemoteApi(); // hardwired dependency, cannot be changed/replaced at run time. Bad

    if (isBetween9AMand6PM()) {
      if (numbers.length() == 0) {
        return 0;
      }
      String[] nums = numbers.split(",|\n");

      validateInput(nums);

      // api.publish(sum);
      Integer sum = Stream.of(nums)
          .map(Integer::parseInt)
          .filter(n -> n < 1000)
          .reduce(0, Integer::sum);
      this.api.publish(sum);
      return sum;
    }
    return 0;
  }

  private boolean isBetween9AMand6PM() {
    LocalTime current = clock.getCurrentTime();
    LocalTime start = LocalTime.of(9, 0);
    LocalTime end = LocalTime.of(18, 0);

    return  !current.isBefore(start) && !current.isAfter(end);
  }

  private static void validateInput(String[] nums) {
    List<Integer> negative = Stream.of(nums)
        .map(Integer::parseInt)
        .filter(n -> n < 0).collect(Collectors.toList());

    if (negative.size() > 0) {
      if (negative.size() == 1) {
        throw new IllegalArgumentException("negative number found");
      }
      throw new IllegalArgumentException("multiple negative numbers found. " + negative.toString());
    }
  }
}
