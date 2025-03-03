package logicalQuestions;

public class ReverseAnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1234;
		int rev=0;
		int count;
		
		while(a!=0) {
		int rem=a%10;//10
		rev=rev*10+rem;//
		a=a/10;//123.4
		System.out.println("Reverse number is: " + rev);
	}
		//System.out.println("Reverse number is: " + rev);

}
}
