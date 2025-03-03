package logicalQuestions;

public class RemoveJunkChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sb = "sweta324@#$";
		sb=sb.replaceAll("[^a-zA-Z0-9]", " ");{
			System.out.println(sb);
		}

	}

}
