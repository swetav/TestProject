package logicalQuestions;

public class JavaSupportsOperatorOverloadingForOnlyPlusOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations obj = new MathOperations();

		System.out.println(obj.add(5, 10));
		System.out.println(obj.add(5.0, 10.0));
	}
}

class MathOperations {

	int add(int a, int b) {
		return a + b;
	}
	double add(double a, double b) {
		return a + b;
	}
}
class words{
	String s1 = "Hello";
	String s2 ="World";
	String result = s1 +  " " + s2;
	 void display() {  // Move the print statement inside a method
	        System.out.println(result);
	 }
}

class Wrapper{
	Integer a =10;
	Integer b =20;
	Integer sum = a+b;
	void displaySum() {  // Create a method to print sum
	System.out.println(sum);
}
}


/*
 * Why Doesn't Java Support Operator Overloading? It prevents ambiguity in
 * expressions.
 * Makes the code easier to read and maintain.
 * However, Java provides limited built-in operator overloading (e.g., string concatenation
 * and wrapper class operations). Instead of operator overloading, Java
 * encourages method overloading for flexibility.
 *
 */