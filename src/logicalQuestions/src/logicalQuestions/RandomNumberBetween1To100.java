package logicalQuestions;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberBetween1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1; // 1 to 100
        Scanner scanner = new Scanner(System.in);
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (!hasGuessedCorrectly) {
            try {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }

                if (userGuess == numberToGuess) {
                    System.out.println("You guessed the correct number: " + numberToGuess);
                    hasGuessedCorrectly = true;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Try again.");
                } else {
                    System.out.println("Try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a numeric value.");
                scanner.nextLine(); // clear invalid input
            }
        }

        scanner.close();
    }
}