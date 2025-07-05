package logicalQuestions;

public class FindMinimumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr={12,34,56,65,32,21};
		
		int Min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i]< Min) {
				Min=arr[i];
			}
		}

	}

}
