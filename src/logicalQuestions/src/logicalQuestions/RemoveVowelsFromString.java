package logicalQuestions;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "remove vowels from this string";
		
		 // Calling the method and storing the result
        String result = removeVowels(input);
        
     // Printing the result
        System.out.println(result);
	}

public static String removeVowels(String str) {
	return str.replaceAll("[aeiouAEIOU]", "");

}
}
