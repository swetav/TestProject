package logicalQuestions;

public class FindMaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {34, 56, 76, 89, 54};

		int max = arr[0];
		
		for(int i=0; i<arr.length;i++) {

		if (arr[i] > max){

			max = arr[i];
		}		
	}

	System.out.println("Maximum number is:" + max);

}
}
