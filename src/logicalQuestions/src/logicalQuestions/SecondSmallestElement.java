package logicalQuestions;

public class SecondSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr= {10,20,30,40,50};
		
		if(arr.length<2) {
			System.out.println("Array can not be smaller than 2");
			return;
		}
		
		int first=Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
		
		if(arr[i]<first) {
			second=first;
			first=arr[i];
		}
		else if(arr[i]<second && arr[i]!=first) {
			second=arr[i];
		}
		}
		if (second ==Integer.MAX_VALUE) {
			System.out.println("No second smallest element");
		}
		else {
			System.out.println("Second smallest element is: " + second);
		}
		
	}

}
