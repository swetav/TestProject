package logicalQuestions;

public class MethodOverloading {

	public static void main(String[] args) {

		/* Achieved by defining multiple methods with the same name but different parameters.
           Happens within the same class */
	
		MethodOverloading outer = new MethodOverloading();
		
		calculator calc = outer.new calculator();
		
		//call overloaded methods
		
		calc.add();
		calc.add(10, 20);
		calc.add(10, 20, 30);

	}
	
	class calculator{
		void add(int a, int b) {
			int sum=a+b;
			System.out.println("sum of two numbers" + sum);
		}
		
		void add(int a, int b, int c) {
			int sum=a+b+c;
			System.out.println("sum of two numbers" + sum);
		}
		
		void add() {
			System.out.println("I have no parameter");
		}
	}

}
