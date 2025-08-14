package logicalQuestions;

import java.util.Arrays;

public class quicklyVerifyIfAGivenIDExistsWithoutLoopingThroughAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]Id = {"1005","1004","1003","1002","1001"};
		Arrays.sort(Id);
		int index= Arrays.binarySearch(Id, "1002");
		System.out.println(Arrays.toString(Id));
	}

}
