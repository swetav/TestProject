package logicalQuestions;

import java.util.Scanner;

public class ChatBotMainAppOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===== Welcome to Chatbot =====");

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            String user_input = scanner.next();

            if(user_input.equalsIgnoreCase("Hi"))
            {
                System.out.println("Hello! How can I help you?");
            }
            else if(user_input.equalsIgnoreCase("bye"))
            {
                System.out.println("Goodbye!");
                System.exit(0);
            }
            else
            {
                System.out.println("I don't understand. Try again.");
            }
        }
    }
	}
