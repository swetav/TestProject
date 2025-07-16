package logicalQuestions;

public class AscendingDescendingSortedInOneMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 90, 30, 50, 10 };
		
		AscendingDescending(arr);
		

	}

	public static String AscendingDescending(int[] arr) {
		boolean isAscending = true;
		boolean isDescending = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isDescending = false;

			} else if (arr[i] < arr[i + 1]) {
				isAscending = false;
			}
		}
		if (isAscending) {
			return "ascending";
		} else if (isDescending) {
			return "descending";
		} else {
			return "not sorted";
		}
	}
}
