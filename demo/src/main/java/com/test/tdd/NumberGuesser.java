package com.test.tdd;

public class NumberGuesser {

  private final int target;

  public NumberGuesser(int target) {
    this.target = target;
  }

  public GuessResult makeGuess(int guessedNumber) {
    if(this.target < guessedNumber) {
      return new GuessResult(true);
    }
    return new GuessResult(false);
  }
}
