package logicalQuestions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginAuthenticationSyatem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String correctUsername = "admin";
		final String correctPassword = "pass123";
		
		Scanner sc = new Scanner(System.in);
		int attempts =0;
		boolean loggedIn = false;
		
		while (attempts < 3 && !loggedIn) 
			
			try {
		
		System.out.println("Enter the username");
		String username = sc.nextLine();
		System.out.println("You entered:" + username);
		
		System.out.println("Enter the pasword");
		String password = sc.nextLine();
		System.out.println("You entered:" + password);
		
		if (username.equals(correctUsername) && password.equals(correctPassword)){
			loggedIn = true;
		}
		else {
			attempts++;
			System.out.println("Incorrect username or password. Attempts left:" + (3 - attempts) );
			}
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid inpou. Please try again.");
			sc.nextLine();
		if (!loggedIn) {
			System.out.println("Too many failed attempts. Exiting program.");
		}
		sc.close();
	}
	}
}
