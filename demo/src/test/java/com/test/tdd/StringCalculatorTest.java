package com.test.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

  // TODO:
  // DONE The function should return zero when the input numbers is empty
  // should return the same number when length is 1

  // it can take any amount of numbers and returns the sum.
  // The numbers are delimited by comma "," and/or new line character "\n”, for e.g “1,2,3” and “1\n2,3” are valid examples.
  // should throw an exception if there is any negative number,
  // if there are many negative numbers, show them all in the exception message.

  @Test public void
  should_return_zero_when_input_is_empty() {
    StringCalculator calc = new StringCalculator();
    int sum = calc.add("");
    assertEquals(0, sum);
  }

  @Test public void
  should_return_same_number_when_input_length_is_one() {
    StringCalculator calc = new StringCalculator();
    int sum = calc.add("5");
    assertEquals(5, sum);
  }


}
