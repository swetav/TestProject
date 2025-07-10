package logicalQuestions;

import java.util.Arrays;

public class BubbleSortDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 20, 30, 40, 50};
		bubbleSortDesending(arr);
		System.out.println("BubbleSortDesending" + Arrays.toString(arr));
	}
	public static void bubbleSortDesending(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp;
					temp=arr[j];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

}
