package logicalQuestions;

public class InsertElementAtGivenPosition {

	public static void main(String[] args) {

		int[] arr = {10, 20, 30, 40, 50}; // original array
		int insertPos = 3; // index to insert at (0-based)
		int newElement = 99;

		// new array with size + 1
		int[] newArr = new int[arr.length + 1];

		for (int i = 0; i < newArr.length; i++) {
			if (i < insertPos) {
				newArr[i] = arr[i]; // copy elements before insertPos
			} else if (i == insertPos) {
				newArr[i] = newElement; // insert the new element
			} else {
				newArr[i] = arr[i - 1]; // shift the rest by one position
			}
		}

		// Print the new array
		System.out.print("Array after insertion: ");
		for (int num : newArr) {
			System.out.print(num + " ");
		}
	}
}
