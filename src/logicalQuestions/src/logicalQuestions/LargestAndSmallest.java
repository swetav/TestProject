package logicalQuestions;

public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,4,6,8,-345};
		int largest=a[0];
		int smallest=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
			else if (a[i]<smallest) {
				smallest=a[i];
			}
			}
		System.out.println("Largest number is::" + largest);
		System.out.println("Smallest numer is::" + smallest);
		}
	}
