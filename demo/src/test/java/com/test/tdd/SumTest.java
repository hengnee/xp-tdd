package com.test.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

  @Test public void
  should_calculate_the_sum_of_two_numbers() {
    assertEquals(10, sum(4, 6));
    assertEquals(8, sum(4, 4));
  }

  private int sum(int a, int b) {
    return a + b;
  }
}