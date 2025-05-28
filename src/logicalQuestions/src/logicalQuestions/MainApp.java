package logicalQuestions;

import java.util.Scanner;

public class MainApp
{
    UserLogin userLogin;
    int no_of_attempts;
    final int MAX_ATTEMPTS = 3;

    public void createNewUser()
    {
        userLogin = new UserLogin();
        userLogin.setEmail("admin@gmail.com");
        userLogin.setPassword("admin123");
    }

    public void loginAuth()
    {
        if(no_of_attempts != 3)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("\n\nEnter your email id : ");
            String user_email = scanner.next();

            System.out.print("Enter your password : ");
            String user_pass = scanner.next();

            if(user_email.equals(userLogin.getEmail()) && user_pass.equals(userLogin.getPassword()))
            {
                System.out.println("Welcome Admin");
            }
            else
            {
                System.err.println("Invalid email id or password");
                no_of_attempts++;
                if(no_of_attempts < MAX_ATTEMPTS)
                {
                    System.out.println((MAX_ATTEMPTS-no_of_attempts)+" attempts left");
                }
                loginAuth();
            }
        }
        else
        {
            System.err.println("------Your account has locked due to 3 invalid login attempts------");
            System.exit(0);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("=========Welcome to Login Auth App========");

        MainApp obj = new MainApp();

        obj.createNewUser();

        obj.loginAuth();
    }
}
