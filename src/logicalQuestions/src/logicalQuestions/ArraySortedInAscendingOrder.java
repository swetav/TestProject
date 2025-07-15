package logicalQuestions;

public class ArraySortedInAscendingOrder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Find the Largest and Second Largest Elements

		int[] arr = { 12, 7, 9, 14, 6, 3, 7, 12 };

		isSorted(arr);
	}

	private static void isSorted(int[] arr) {
		// TODO Auto-generated method stub
		boolean isSorted = true;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > arr[i + 1]) {
				isSorted = false;
				break;
			}
		}

		if (isSorted) {
			System.out.println("Array is sorted in ascending order");
		} else {
			System.out.println("Array is not sorted in ascending order");
		}
	}

}
