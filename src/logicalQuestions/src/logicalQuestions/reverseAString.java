package logicalQuestions;

public class reverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Selenium";
		//initialize an empty StringBuilder to reversed string 
		StringBuilder reverseName = new StringBuilder();
		
		//Loop through the string from the end to the begenning
		for (int i=name.length()-1;i>=0; i--) {
			
			reverseName.append(name.charAt(i));
		}
		//Print the reversed string
		System.out.println(reverseName.toString());
	}

}
