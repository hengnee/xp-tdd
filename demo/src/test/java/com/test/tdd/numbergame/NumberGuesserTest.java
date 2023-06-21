package com.test.tdd.numbergame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberGuesserTest {

  NumberGuesser guesser;
  @Before
  public void setup() {
    guesser = new NumberGuesser(10);
  }

  @Test public void
  should_be_able_to_tell_if_the_number_is_higher() {
    GuessResult result = guesser.makeGuess(11);
    assertTrue(result.isHigh());
  }

  @Test public void
  should_be_able_to_tell_if_the_number_is_lower() {
    GuessResult result = guesser.makeGuess(9);
    assertFalse(result.isHigh());
  }

  @Test public void
  should_be_able_to_tell_the_number_of_attempts() {
    guesser.makeGuess(9);
    guesser.makeGuess(19);
    GuessResult result = guesser.makeGuess(19);
    assertEquals(3, result.getAttempts());
  }

}
