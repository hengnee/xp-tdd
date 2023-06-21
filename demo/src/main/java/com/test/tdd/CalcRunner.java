package com.test.tdd;

public class CalcRunner {

  public static void main(String[] args) {
    StringCalculator calculator = new StringCalculator(new SystemClock());
    int sum = calculator.add("1,2,3");
    System.out.println("Sum is: "+ sum);
  }
}
