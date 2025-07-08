package logicalQuestions;

public class CoutFrequencyOfASpecificElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr= {10, 20, 30, 10, 40, 50, 60, 30, 80};
		
		int element=30;
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				count++;				
			}
		}
		System.out.println("Element:" + element + "is occured "+ count +" times");
	}

}
