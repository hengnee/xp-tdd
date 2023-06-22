package com.test.tdd;

public class CalcRunner {

  public static void main(String[] args) {
    SystemClock systemClock = new SystemClock(); //dependency
    StringCalculator calculator = new StringCalculator(systemClock, null); // dependency wiring

    int sum = calculator.add("1,2,3");
    System.out.println("Sum is: "+ sum);
  }
}
