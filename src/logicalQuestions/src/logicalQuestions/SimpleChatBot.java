package logicalQuestions;

import java.util.Scanner;

public class SimpleChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("🤖 Chatbot: Hello! Type 'hi' to greet, or 'bye' to exit.");

        while (true) {
            System.out.print("👤 You: ");
            userInput = scanner.nextLine().trim().toLowerCase();

            if (userInput.equals("hi")) {
                System.out.println("🤖 Chatbot: Hello! How can I help you?");
            } else if (userInput.equals("bye")) {
                System.out.println("🤖 Chatbot: Goodbye!");
                break;
            } else {
                System.out.println("🤖 Chatbot: I don't understand. Try again.");
            }
        }

        scanner.close();
    }
}