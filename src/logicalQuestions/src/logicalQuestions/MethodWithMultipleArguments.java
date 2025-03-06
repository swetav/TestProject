package logicalQuestions;

public class MethodWithMultipleArguments {

	public static void main(String[] args) {
		
		String name ="Buzo";
		String place="Internet";
		
		
		String testingI;
		String testingS;
		
		MethodWithMultipleArguments one = new MethodWithMultipleArguments(); 
		
		// Calling methods with arguments
        one.testingS(name, place);
        
     // Calling testingInt and storing result
        int sum = one.testingI(10, 20);
        System.out.println("Sum: " + sum);
		
	}
	public void testingS(String name, String place) {
		
		System.out.println("Name:" + name);
		System.out.println(place);
	}
	public int testingI(int a, int b) {
		return a+b;
		
	}

}
