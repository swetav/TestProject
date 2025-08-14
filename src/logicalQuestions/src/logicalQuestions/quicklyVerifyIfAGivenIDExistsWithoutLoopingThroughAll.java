package logicalQuestions;

import java.util.Arrays;

public class quicklyVerifyIfAGivenIDExistsWithoutLoopingThroughAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]Id = {"1005","1004","1003","1002","1001"};
		Arrays.sort(Id);
		int index= Arrays.binarySearch(Id, "1002");
		
		if(index>=0) {
			System.out.println("ID found at index:" + index);
		}
		else {
			System.out.print("ID not found");
		}
		System.out.println("Sorted IDS:" + Arrays.toString(Id));
	}

}
