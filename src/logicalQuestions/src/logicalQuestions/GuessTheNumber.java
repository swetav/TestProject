package logicalQuestions;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Random random = new Random();
	        int numberToGuess = random.nextInt(100) + 1; // random number between 1 and 100

	        Scanner scanner = new Scanner(System.in);
	        boolean hasGuessedCorrectly = false;

	        System.out.println("Guess the number between 1 and 100:");

	        while (!hasGuessedCorrectly) {
	            try {
	                int userGuess = scanner.nextInt();

	                if (userGuess > numberToGuess) {
	                    System.out.println("Too high! Try again:");
	                } else if (userGuess < numberToGuess) {
	                    System.out.println("Too low! Try again:");
	                } else {
	                    System.out.println("Congratulations! You guessed it right!");
	                    hasGuessedCorrectly = true;
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Invalid input! Please enter a number.");
	                scanner.nextLine(); // clear invalid input
	            }
	        }

	        scanner.close();

	}

}
