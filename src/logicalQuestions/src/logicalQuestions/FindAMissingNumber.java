package logicalQuestions;

public class FindAMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,4,5,6,7};
		int sum=0;
		
		
		for(int i=0;i<a.length-1;i++) {
			sum=(sum+a[i]);
		}
		System.out.println(sum);
		int sum1=0;
		for(int j=1;j<=a.length;j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1);
		System.out.println("Missing number is:" + (sum1-sum));
	}

}
