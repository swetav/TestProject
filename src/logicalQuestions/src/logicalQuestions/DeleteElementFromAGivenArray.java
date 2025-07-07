package logicalQuestions;

public class DeleteElementFromAGivenArray {

	public static void main(String[] args) {

		int[] arr = {10, 45, 12, 34, 55, 65, 14, 33};
		int indexPosition = 4;

		int[] newArr = new int[arr.length - 1];

		for (int i = 0, j = 0; i < arr.length; i++) {
			if (i == indexPosition) {
				continue; // skip the element at indexPosition
			}
			newArr[j++] = arr[i]; // copy remaining elements
		}

		// Print the new array
		for (int no : newArr) {
			System.out.print(no + " ");
		}
	}
}
