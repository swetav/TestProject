package logicalQuestions;

public class PalindromeNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = -121;
int originalNumber=num;
int rev=0;

if(originalNumber<0) {
	System.out.println("Not a prime number");
	return;
}

while(num!=0) {
int rem= num % 10;
rev= rev * 10 + rem;
num= num/10;

}
System.out.println(rev+ " " + "I am reversed");

if(originalNumber==rev) {
	System.out.println("It is a palindrome");
}
else{
	System.out.println("It is not a palindrome number");

	}
	}
}
