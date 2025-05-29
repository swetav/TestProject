package logicalQuestions;

import java.util.Scanner;

public class ChatBotMainAppTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		{
	        System.out.println("===== Welcome to Chatbot =====");

	        Scanner scanner = new Scanner(System.in);

	        while(true)
	        {
	            String user_input = scanner.next();
	            if(user_input.equalsIgnoreCase("Hi"))
	            {
	                String chatbot_output = "Hello! How can I help you?";
	                for(int i=0; i<chatbot_output.length(); i++)
	                {
	                    System.out.print(chatbot_output.charAt(i));
	                    Thread.sleep(100);
	                }
	            }
	            else if(user_input.equalsIgnoreCase("bye"))
	            {
	                String chatbot_output = "Goodbye!";
	                for(int i=0; i<chatbot_output.length(); i++)
	                {
	                    System.out.print(chatbot_output.charAt(i));
	                    Thread.sleep(100);
	                }
	                System.exit(0);
	            }
	            else
	            {
	                String chatbot_output = "I don't understand. Try again.";
	                for(int i=0; i<chatbot_output.length(); i++)
	                {
	                    System.out.print(chatbot_output.charAt(i));
	                    Thread.sleep(100);
	                }
	            }
	            System.out.println();
	        }
	    }
	}


	}
