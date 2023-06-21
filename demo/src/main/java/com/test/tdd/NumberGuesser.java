package com.test.tdd;

public class NumberGuesser {

  private final int target;

  public NumberGuesser(int target) {
    this.target = target;
  }

  public boolean makeGuess(int guessedNumber) {
    return this.target < guessedNumber;
  }
}
