package logicalQuestions;

import java.util.ArrayList;

public class AddEvenAndOddInSeparateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,4,5};
		EvenAndOddInSeparateArray(arr);

	}
	
	public static void EvenAndOddInSeparateArray(int[] arr) {
		ArrayList<Integer> evenList=new ArrayList<>();
		ArrayList<Integer> oddList=new ArrayList<>();
			
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenList.add(arr[i]);
			}
			else {
				oddList.add(arr[i]);
			}
		}
		System.out.println("even numbers in one array"+evenList);
		System.out.println("odd numbers in another array"+oddList);
		}
	}
