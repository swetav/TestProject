package logicalQuestions;

import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        int score = checkPasswordStrength(password);

        // Display strength
        if (score == 4) {
            System.out.println(" Password Strength: Strong");
        } else if (score >= 2) {
            System.out.println(" Password Strength: Medium");
        } else {
            System.out.println(" Password Strength: Weak");
        }

        scanner.close();
    }

    public static int checkPasswordStrength(String password) {
        int score = 0;

        if (password.length() >= 8)
            score++;

        if (password.matches(".*[A-Z].*"))
            score++;

        if (password.matches(".*[0-9].*"))
            score++;

        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*"))
            score++;

        return score;
    }
}