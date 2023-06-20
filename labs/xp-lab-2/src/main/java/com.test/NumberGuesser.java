package com.test;
import java.lang.Math;
import java.util.Scanner;

public class NumberGuesser {
    private String playerName;
    private int randomisedAnswer;
    private int attempts;
    private Scanner sc;

    public NumberGuesser() {
        randomisedAnswer = (int) (Math.random() * 100);
        attempts = 3;
        sc = new Scanner(System.in);
    }

    public boolean verifyPlayerAnswer(int value) {
        return value >= 1 && value <= 100;
    }

    public void inputPlayerName() {
        System.out.print("Please input your name: ");
        this.playerName = sc.nextLine();
    }

    public void startGame() {
        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter your guess: ");
            int playerInput = sc.nextInt();
            if (!this.verifyPlayerAnswer(playerInput)) {
                System.out.println("Value " + playerInput + " not within range of 1 to 100");
            }

            if (playerInput == randomisedAnswer) {
                System.out.println("Well done "+ playerName + "You got it in " + (i + 1) + " attempt(s)!");
                break;
            } else if (playerInput < randomisedAnswer) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        }
        System.out.println("Correct answer is " + randomisedAnswer);
    }

    public static void main(String[] args) {
        NumberGuesser numberGuesser = new NumberGuesser();
        numberGuesser.inputPlayerName();
        numberGuesser.startGame();
    }
}