package logicalQuestions;

import java.util.ArrayList;

public class RemoveAGivenCharacterFromTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Seelenium";
		char remove = 'e';
		
		//ReplaceFirst will replace the first e. Replace all will remove all e's
		str = str.replaceFirst(Character.toString(remove), "");
		System.out.println(str);

	}

}
