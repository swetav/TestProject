package logicalQuestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method-1;
		int a=10;
		int b=20;
		//int c = 0;
		
		//System.out.println("Before swapping a::" + a);	
		//System.out.println("Before swapping b::" + b);	
		//System.out.println("Before swapping c::" + c);	
		
		//c=a;
		//a=b;
		//b=c;
		
		//method2
		
		a=a^b;
		b=b^a;
		a=b^a;
		System.out.println("After swapping a::" + a);	
		System.out.println("After swapping b::" + b);	
		//System.out.println("After swapping c::" + c);	
		
		//method3
		
		
	
	}

}
