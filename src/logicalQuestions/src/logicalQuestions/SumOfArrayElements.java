package logicalQuestions;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {2,45,67,98,32};
		
		int sum =0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum of array elements:" + " " + sum);
	}

}
