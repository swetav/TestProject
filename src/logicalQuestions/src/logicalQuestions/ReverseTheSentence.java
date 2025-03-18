package logicalQuestions;

public class ReverseTheSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//find the first non-repeated character in a string without using complex data structures like HashMap.

		String name = "I am reversing this sentence";
		
		String[] words = name.split(" ");

		StringBuilder reverseSentence = new StringBuilder();
		
	//loop through the words array in reverse order
		
		for(int i=words.length-1; i>=0;i--) {
			
			reverseSentence.append(words[i]);
			
			if(i!=0) {
				reverseSentence.append(" ");
			}
		}
		System.out.println(reverseSentence.toString());
}
	}

