package logicalQuestions;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {50, 20, 50, 10};

		if(arr.length<2) {
			System.out.println("Array need at least 2 elements");
			return;
		}
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>first) {
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second && arr[i]!=first) {
				second=arr[i];
			}
		}
			
			if(second == Integer.MIN_VALUE) {
				System.out.println("There is no second largest element (all values are equal).");
			}
			else {
				System.out.println("Second largest element is: " + second);
			}
			
			}
		}
