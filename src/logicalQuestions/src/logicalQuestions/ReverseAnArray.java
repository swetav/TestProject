package logicalQuestions;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2,23,45,67,78,90};
		
		System.out.println("Original array: " + Arrays.toString(arr));	
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		System.out.println("Reverse an array:" + Arrays.toString(arr));
		
	}

}
