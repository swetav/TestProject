package logicalQuestions;

import java.util.Arrays;

public class SelectionSortDesending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 90, 40, 20, 30, 10, 50 };
		selectionSortDesending1(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void selectionSortDesending1(int[] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {
			int maxIndex = i;
			
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[maxIndex];
			arr[maxIndex]=temp;
		}
	}
}