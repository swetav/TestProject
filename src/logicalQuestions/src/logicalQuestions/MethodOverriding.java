package logicalQuestions;

public class MethodOverriding {

	public static void main(String[] args) {

		/*
		 * Happens when a child class provides a new implementation of a method from the
		 * parent class. Requires inheritance and the @Override annotation.
		 */

	}

	class Child extends Parent {
		@Override
		void earn() {
			System.out.println("I am inheriting money from my parent");
		}
	}

	class Parent {
		void earn() {
			System.out.println("I am earning money");
		}
	}
}
