package logicalQuestions;

import java.util.Arrays;

public class BubbleSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5}; 
		
		bubblesort(arr);
		
		System.out.println("Sorted array" + Arrays.toString(arr));
	}		
		public static void bubblesort(int[]arr) {
		int n=arr.length;
		
		for(int i=0;i<arr.length;i++) {//outer loop
			for(int j=0;j<n-i-1;j++) {//inner loop
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];//swap
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

	}

}
