package com.test.tdd.numbergame;

import com.test.tdd.numbergame.GuessResult;

public class NumberGuesser {

  private final int target;
  private int attempts;

  public NumberGuesser(int target) {
    this.target = target;
    this.attempts = 0;
  }

  public GuessResult makeGuess(int guessedNumber) {
    this.attempts++;
    if(this.target < guessedNumber) {
      return new GuessResult(true, attempts);
    }
    return new GuessResult(false, attempts);
  }
}
