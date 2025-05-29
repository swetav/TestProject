package logicalQuestions;

import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class ATM {
			private final int CORRECT_PIN = 1234;
			private double balance = 10000.00; // starting balance

			public void start() {
				Scanner scanner = new Scanner(System.in);
				int enteredPin;

				System.out.println("Welcome to the ATM");

				// PIN validation
				System.out.print("Enter your PIN: ");
				try {
					enteredPin = scanner.nextInt();

					if (enteredPin != CORRECT_PIN) {
						System.out.println("Incorrect PIN. Exiting...");
						return;
					}

					int choice;
					do {
						// Display menu
						System.out.println("\n--- ATM Menu ---");
						System.out.println("1. Check Balance");
						System.out.println("2. Withdraw Money");
						System.out.println("3. Deposit Money");
						System.out.println("4. Exit");
						System.out.print("Choose an option: ");

						choice = scanner.nextInt();

						switch (choice) {
						case 1:
							System.out.println("Current Balance: ₹" + balance);
							break;

						case 2:
							System.out.print("Enter amount to withdraw: ₹");
							double withdrawAmount = scanner.nextDouble();
							if (withdrawAmount > balance) {
								System.out.println(" Insufficient balance.");
							} else if (withdrawAmount <= 0) {
								System.out.println(" Invalid amount.");
							} else {
								balance -= withdrawAmount;
								System.out.println(" Withdrawal successful. New Balance: ₹" + balance);
							}
							break;

						case 3:
							System.out.print("Enter amount to deposit: ₹");
							double depositAmount = scanner.nextDouble();
							if (depositAmount <= 0) {
								System.out.println(" Deposit amount must be greater than 0.");
							} else {
								balance += depositAmount;
								System.out.println("Deposit successful. New Balance: ₹" + balance);
							}
							break;

						case 4:
							System.out.println("Thank you for using the ATM. Goodbye!");
							break;

						default:
							System.out.println("Invalid option. Please choose between 1-4.");
						}

					} while (choice != 4);

				} catch (InputMismatchException e) {
					System.out.println("Invalid input! Please enter numbers only.");
				} finally {
					scanner.close();
				}
			}
			}
		}

	}
