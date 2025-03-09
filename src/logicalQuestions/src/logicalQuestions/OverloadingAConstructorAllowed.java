package logicalQuestions;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingAConstructorAllowed obj1 = new OverloadingAConstructorAllowed();
		OverloadingAConstructorAllowed obj2 = new OverloadingAConstructorAllowed(10);
	}
}

class OverloadingAConstructorAllowed {
	int a;

	//Constructor 1
	OverloadingAConstructorAllowed() {
		System.out.println("Default Constructor");
	}

	////Constructor 2
	OverloadingAConstructorAllowed(int a) {
		this.a = a;
		System.out.println("Parameterized Constructor" + a);
	}
}

