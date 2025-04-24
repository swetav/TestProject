package logicalQuestions;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=5;

		if (no < 0) {
			System.out.println("Factorial is not defined for negative numbers ");
		}
		else {
			long fact = 1;
		
		for (int i = 1; i<=no; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of " + no + " is: " + fact);
		
		

}
}
}
