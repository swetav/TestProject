package logicalQuestions;

public class FindFirstOccuranceOfAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2,6,9,4,3,1};
		int element=6;
		boolean status=false;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==element) {
				System.out.println("Element found at"+"index position:"+ i);
				status=true;
				break;
			}
		}
		
	}

}
