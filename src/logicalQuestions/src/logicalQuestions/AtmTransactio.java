package logicalQuestions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtmTransactio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int correctPIN = 1234; // hardcoded PIN
		double balance = 1000.0; // starting balance

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the ATM!");
		System.out.print("Enter your PIN: ");

		try {
			int enteredPIN = scanner.nextInt();

			if (enteredPIN == correctPIN) {
				int choice;
				do {
					System.out.println("\nATM Menu:");
					System.out.println("1. Check Balance");
					System.out.println("2. Withdraw Money");
					System.out.println("3. Deposit Money");
					System.out.println("4. Exit");
					System.out.print("Enter your choice: ");

					choice = scanner.nextInt();

					switch (choice) {
					case 1:
						System.out.println("Your current balance is: $" + balance);
						break;
					case 2:
						System.out.print("Enter amount to withdraw: ");
						double withdrawAmount = scanner.nextDouble();
						if (withdrawAmount > 0 && withdrawAmount <= balance) {
							balance -= withdrawAmount;
							System.out.println("Please collect your cash. New balance: $" + balance);
						} else {
							System.out.println("Insufficient balance or invalid amount.");
						}
						break;
					case 3:
						System.out.print("Enter amount to deposit: ");
						double depositAmount = scanner.nextDouble();
						if (depositAmount > 0) {
							balance += depositAmount;
							System.out.println("Deposit successful. New balance: $" + balance);
						} else {
							System.out.println("Deposit amount must be greater than 0.");
						}
						break;
					case 4:
						System.out.println("Thank you for using the ATM. Goodbye!");
						break;
					default:
						System.out.println("Invalid choice. Please try again.");
					}
				} while (choice != 4);
			} else {
				System.out.println("Incorrect PIN. Access denied.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input! Please enter numbers only.");
		} finally {
			scanner.close();
		}
	}
}
