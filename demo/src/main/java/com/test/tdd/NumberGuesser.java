package com.test.tdd;

public class NumberGuesser {

  private final int target;

  public NumberGuesser(int target) {
    this.target = target;
  }

  public boolean makeGuess(int guessedNumber) {
    if(this.target < guessedNumber) {
      return new GuessResult(true).isHigh();
    }
    return new GuessResult(false).isHigh();
  }
}
