package logicalQuestions;

public class CalculatorUsingTheSwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no1=1;
int no2=2;
char operator='*';
double result;

switch (operator) {
case '+':
	result = no1 + no2;
	System.out.println("Result:" + result);
case '-':
	result = no1-no2;
	System.out.println("Result:" + result);
case '*':
	result = no1*no2;
	System.out.println("Result:" + result);
case '/':
	if (no1 !=0) {
	result = no1 % no2;
	System.out.println("Result:" + result);
	
	


}
	
	}
	}
}
