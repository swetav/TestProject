package logicalQuestions;

public class OverridingAConstructorNotPossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj = new Child();
	}
}

	class Parent {
		Parent() {
			System.out.println("Parent Constructor");
		}
	}

	class Child extends Parent {
		Child() {
			System.out.println("Child Constructor");
		}

	}

/*Here, the constructor of the Child class does not 
 * override the Parent constructor but instead calls it 
 * using super() implicitly.The super() keyword in Java 
 * is used to call the constructor of the parent class explicitly. 
 * By default, if a subclass constructor does not call super(), 
 * the compiler implicitly inserts super(); as the first statement. 
 * However, if the parent class has a parameterized constructor, 
 * we must call it explicitly. If we do not use super(), 
 * Java automatically calls the default constructor of the parent class.
 */