package logicalQuestions;

import java.util.Scanner;

public class InputFromAUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int number1=sc.nextInt();
		System.out.println("Enter the second number:");
		int number2=sc.nextInt();
		System.out.println("Enter the result:");
		int sum=number1+number2;
		System.out.println("sum:" + sum);
		

	}

}
