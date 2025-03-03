package logicalQuestions;

import java.util.Scanner;

public class Calculator {
	
	public void addition(int no1,int no2) {
		System.out.println("Addition is:" + (no1+no2));
	}
	public void substraction(int no1,int no2) {
		System.out.println("Addition is:" + (no1-no2));
	}
	public void multiplication(int no1,int no2) {
		System.out.println("Addition is:" + (no1*no2));
	}
	public void division(int no1,int no2) {
		System.out.println("Addition is:" + (no1/no2));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		sc.nextInt();
		

		switch(operator) {
		case '+':
			result=no1+no2;
			System.out.println("res" + result);
			break;

		case '-':
			result=no1-no2;
			System.out.println("res" + result);
			break;

		case '*':
			result=no1*no2;
			System.out.println("res" + result);
			break;

		case '/':
			result=no1/no2;
			System.out.println("res" + result);
			break;
			
			default:
			System.out.println("Not a valid number");
			break;
			}
		}


