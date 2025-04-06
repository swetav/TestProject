package logicalQuestions;

import java.util.Scanner;

public class OnlineExamSystem {

    // Hardcoded credentials
    static final String USERNAME = "user123";
    static final String PASSWORD = "pass123";

    // Question bank
    static String[] questions = {
        "1. What is the capital of India?\nA. Delhi\nB. Mumbai\nC. Chennai\nD. Kolkata",
        "2. Who invented Java?\nA. Dennis Ritchie\nB. James Gosling\nC. Bjarne Stroustrup\nD. Guido van Rossum",
        "3. What is 10 + 5?\nA. 12\nB. 15\nC. 10\nD. 20",
        "4. What is the output of 4 * 2?\nA. 6\nB. 10\nC. 8\nD. 12",
        "5. Which is a programming language?\nA. HTML\nB. CSS\nC. Java\nD. Photoshop"
    };

    static char[] answers = {'A', 'B', 'B', 'C', 'C'};
    static int score = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Online Exam System =====");

        // Login
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (!username.equals(USERNAME) || !password.equals(PASSWORD)) {
            System.out.println(" Invalid credentials. Access denied.");
            sc.close();
            return;
        }

        System.out.println(" Login successful! Welcome " + username + "!");

        while (true) {
            // Menu
            System.out.println("\n--- MENU ---");
            System.out.println("1. Take Exam");
            System.out.println("2. View Result");
            System.out.println("3. Logout & Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    takeExam(sc);
                    break;
                case 2:
                    viewResult();
                    break;
                case 3:
                    System.out.println(" You have been logged out. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println(" Invalid choice. Try again.");
            }
        }
    }

    public static void takeExam(Scanner sc) {
        score = 0;
        System.out.println("\n Exam started. Please enter your answers (A/B/C/D):");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.print("Your answer: ");
            char ans = sc.nextLine().toUpperCase().charAt(0);
            if (ans == answers[i]) {
                score++;
            }
        }
        System.out.println("\n Exam submitted successfully!");
    }

    public static void viewResult() {
        System.out.println("\n Your Score: " + score + " out of " + answers.length);
        if (score >= 4) {
            System.out.println(" Excellent Performance!");
        } else if (score >= 2) {
            System.out.println(" Good Try. Keep Practicing.");
        } else {
            System.out.println("⚠ Needs Improvement.");
        }
    }
}
