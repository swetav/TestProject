package logicalQuestions;

import java.util.Scanner;

public class LoginAuthenticationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String CORRECTUSERNAME ="admin";
		final String CORRECTPASSWORD = "password";
		int attempts=3;
		
		Scanner sc = new Scanner(System.in);
		
		while (attempts > 0) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (username.equals(CORRECTUSERNAME) && password.equals(CORRECTPASSWORD)) {
                System.out.println("Login successful!");
                sc.close();
                return;
            } else {
                attempts--;
                System.out.println("Incorrect credentials. Attempts left: " + attempts);
            }
        }

        System.out.println("Too many failed attempts. Exiting...");
        sc.close();
    }
}
