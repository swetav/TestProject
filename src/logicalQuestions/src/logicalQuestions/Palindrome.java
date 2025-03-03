package logicalQuestions;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=121;
		int pal=no;
		int rev=0;
		int rem;
			
		while(no>0) {
		rem=no%10;
		rev=rev*10+rem;
		no=no/10;
		
	}
		System.out.println(rev);
		if(pal==rev) {
			System.out.println("Number is a palindrom number");
		}
		else {
			System.out.println("Number is not a palindrom number");
		}
}
	
}
