package logicalQuestions;

public class Overloading {
	
	void add(int a, int b) {
		System.out.println(a+b);	
		}
	
	void multiply(int a, int b) {
		System.out.println(a*b);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading obj = new Overloading(); {
			obj.add(10, 20);
		}
		Overloading obj2 = new Overloading();{
			obj2.multiply(10, 20);
		}

	}

}
