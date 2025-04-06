package logicalQuestions;
import java.util.Scanner;

// Custom Exception 1
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Custom Exception 2
class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount <= 0) {
            throw new NegativeAmountException("❌ Cannot deposit a negative or zero amount.");
        }
        balance += amount;
        System.out.println("✅ ₹" + amount + " deposited. New balance: ₹" + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException, NegativeAmountException {
        if (amount <= 0) {
            throw new NegativeAmountException(" Cannot withdraw a negative or zero amount.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException(" Withdrawal failed. Insufficient balance.");
        }
        balance -= amount;
        System.out.println("✅ ₹" + amount + " withdrawn. Remaining balance: ₹" + balance);
    }

    public void checkBalance() {
        System.out.println(" Current balance: ₹" + balance);
    }
// Main Class
public static class BankingSystemWithExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(5000); // Initial balance

        while (true) {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        account.checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ₹");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ₹");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.out.println("Thank you for banking with us!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("️Invalid choice. Try again.");
                }
            } catch (NegativeAmountException | InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(" Invalid input. Please enter numbers only.");
                scanner.nextLine(); // Clear input buffer
            }
        }
    }
}
}
