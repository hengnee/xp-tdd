package com.test.tdd;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class NumberGuesserTest {

  @Test
  public void
  should_be_able_to_tell_if_the_number_is_higher() {
    NumberGuesser guesser = new NumberGuesser();
    boolean isHigh = guesser.makeGuess(10, 11);
    assertTrue(isHigh);
  }
}
