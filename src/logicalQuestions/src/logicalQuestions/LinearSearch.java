package logicalQuestions;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 20, 30, 40, 50, 60};
		
		int element = 30;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				System.out.println("Element found at "+i+"index position");
						break;
			}
		}

	}

}
