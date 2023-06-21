package com.test.tdd.numbergame;

public class GameRunner {

  private static final int MAX_TIMES = 10;

  public static void main(String[] args) {
//    GameRunner runner = new GameRunner();
    int randomNumber = 10;
    NumberGuesser guesser = new NumberGuesser(randomNumber);
    GuessResult result;
    for(int i =0; i < MAX_TIMES; i++) {
      // asking the user for input
//      result = guesser.makeGuess(guessedNumber);
      // isHigher
      // attempts
    }
  }
}
