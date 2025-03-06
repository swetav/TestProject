package logicalQuestions;

public class FindGreatestNumberBetweenThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 30;

		findGreatest(a, b, c);
	}

	public static void findGreatest(int a, int b, int c) {
		if ((a > b) && (a > c)) {
			System.out.println("a is greatest");
		} else if ((b > a) && (b > c)) {
			System.out.println("b is greatest");
		} else {
			System.out.println("c is greatest");
		}
	}

}
