package com.test.tdd.numbergame;

public class GuessResult {
  private final boolean isHigh;
  private final int attempts;

  public GuessResult(boolean isHigh, int attempts) {

    this.isHigh = isHigh;
    this.attempts = attempts;
  }

  public boolean isHigh() {
    return isHigh;
  }

  public int getAttempts() {
    return attempts;
  }
}
