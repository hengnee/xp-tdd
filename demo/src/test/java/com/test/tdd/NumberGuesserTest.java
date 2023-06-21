package com.test.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberGuesserTest {

  NumberGuesser guesser;
  @Before
  public void setup() {
    guesser = new NumberGuesser();
  }

  @Test public void
  should_be_able_to_tell_if_the_number_is_higher() {
    boolean isHigh = guesser.makeGuess(10, 11);
    assertTrue(isHigh);
  }

  @Test public void
  should_be_able_to_tell_if_the_number_is_lower() {
    boolean isHigh = guesser.makeGuess(10, 9);
    assertFalse(isHigh);
  }
}
