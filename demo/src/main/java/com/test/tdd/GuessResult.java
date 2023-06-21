package com.test.tdd;

public class GuessResult {
  private final boolean isHigh;

  public GuessResult(boolean isHigh) {

    this.isHigh = isHigh;
  }

  public boolean isHigh() {
    return isHigh;
  }
}
