package logicalQuestions;

import java.util.Scanner;

public class ChatBotMainAppThree {
    public void chatbotOutput(String chatbot_output) throws Exception {
        for (int i = 0; i < chatbot_output.length(); i++) {
            System.out.print(chatbot_output.charAt(i));
            Thread.sleep(100);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("===== Welcome to Chatbot =====");

        ChatBotMainAppThree obj = new ChatBotMainAppThree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nYou: ");
            String user_input = scanner.nextLine();

            if (user_input.equalsIgnoreCase("Hi")) {
                obj.chatbotOutput("Hello! How can I help you?");
            } else if (user_input.equalsIgnoreCase("bye")) {
                obj.chatbotOutput("Goodbye!");
                System.exit(0);
            } else {
                obj.chatbotOutput("I don't understand. Try again.");
            }
            System.out.println();
        }
    }
}