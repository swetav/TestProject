package logicalQuestions;

public class StringReverseAndPalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original =" Madam ";
		String cleaned = original.replaceAll("[a-zA-Z]","").toLowerCase();
		String reversed= new StringBuffer(cleaned).reverse().toString();
		System.out.println("Reserved string :" + original);
		
		if (cleaned.equals(reversed)) {
		    System.out.println("It's a palindrome!");
		} else {
		    System.out.println("Not a palindrome.");
		}
	}
}