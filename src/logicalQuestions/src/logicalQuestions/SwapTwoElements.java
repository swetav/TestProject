package logicalQuestions;

public class SwapTwoElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {12,34,56,78,90,21};
		
		int index_one=1;
		int index_two=4;
		
		int temp=arr[index_one];
		arr[index_one]=arr[index_two];
		arr[index_two]=temp;
		
		for(int no:arr) {
		
			System.out.println(no);
		}
		

	}

}
