package logicalQuestions;

import java.util.ArrayList;

public class CreateThirdArrayForMatchingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 3, 5, 7, 8, 9 };
		int[] b = { 1, 3, 0, 4, 7, 8 };
		int[] ab = new int[4];

		ArrayList<Integer> a1 = new ArrayList<>();

		thirdArray(a, b, a1);

		System.out.println("Matching elements:" + a1);

	}

	public static void thirdArray(int[] a, int[] b, ArrayList<Integer> a1) {
		for (int value : a) {
			for (int valueB : b) {
				if (value == valueB && !a1.contains(value)) {
					a1.add(value);
					break;
				}
			}
		}
	}
}