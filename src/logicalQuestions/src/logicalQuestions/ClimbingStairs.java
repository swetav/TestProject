package logicalQuestions;

import java.util.Arrays;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =10; //how many ways to climb a staircase of 10 steps.
		int[]memo = new int[n+1];//Creates a memoization array of size n+1 (so indices 0 through 10).
		
		
		Arrays.fill(memo, -1); //Important initialization- to initialize the memoization array so we can tell which values have not been computed yet.
		
		int result = climb(n, memo);
		System.out.println("ways to climb " + n + " stairs: " + result);
	}
	public static int climb (int n, int[] memo) {
		if(n <=1) return 1;
		
		if(memo[n] !=-1) return memo[n];
		
		memo[n]=climb(n-1, memo) + climb(n-2, memo);
		
		return memo[n];
		
	}

}
