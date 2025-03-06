package logicalQuestions;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = " remove vowels from this string";
		a=a.replaceAll("[aeiouAEIOU]", "");
		System.out.println(a);
	}

}
