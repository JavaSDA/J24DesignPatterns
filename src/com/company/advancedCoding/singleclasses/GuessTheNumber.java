package com.company.advancedCoding.singleclasses;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private static final int MAX_ATTEMPTS = 10;
    private static final int NUMBER_RANGE = 100;

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        // Introduction and player name
        System.out.println("Welcome to the Guessing game!");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        String playAgain = "Y";
        while("Y".equalsIgnoreCase(playAgain)) {
            int targetNumber = generateRandomNumber(NUMBER_RANGE);
            int attempts = 0; // TODO: Revise to count downwards
            int guess;
            boolean guessedCorrectly = false;

            System.out.println("Hi, " + playerName + "! I'm thinking of a number" +
                    " between 1 and " + NUMBER_RANGE + ". You have " + MAX_ATTEMPTS +
                    " attempts to guess the number.");

            while(attempts < MAX_ATTEMPTS && !guessedCorrectly) {
                attempts++;

                System.out.print("Attempt " + attempts + ", Enter your guess: ");

                try {
                    guess = scanner.nextInt();

                    scanner.nextLine(); // so the scanner doesn't bug

                    if (guess == targetNumber) {
                        System.out.println("Congratulations " + playerName + ", you guessed " +
                                " the number " + targetNumber + " in " + attempts + " attempts");

                        guessedCorrectly = true;
                    } else if (guess < targetNumber) {
                        System.out.println("Too low!");
                    } else {
                        System.out.println("Too high");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input! please enter a valid integer");
                    scanner.nextLine(); // consume the invalid input
                }
            }
            if (!guessedCorrectly) {
                System.out.println("Sorry, " + playerName + "! You couldn't guess the number " + targetNumber
                + " in " + MAX_ATTEMPTS + " attempts. Game Over!");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine();
        }

        System.out.print("Thank you for playing the guessing game with us");
        // close the scanner if you want to
        scanner.close();

    }

    private static int generateRandomNumber(int range) {
        Random random = new Random();
        return random.nextInt(range) + 1;
    }
}
