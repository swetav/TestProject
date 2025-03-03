package logicalQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, -3, 3, 4, 6, 7, 9, 3 };

		/*for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
					break;*/
		
		Set<Integer> s = new HashSet<>();
		for (int no:a) {
			if(s.add(no)==false) {
			System.out.println(no);
			}
			
		}

				}
			}
