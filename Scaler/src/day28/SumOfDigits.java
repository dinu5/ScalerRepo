package day28;

/*
Q2. Sum of Digits!

Problem Description
Given a number A, we need to find the sum of its digits using recursion.

 */

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A= 234;
		System.out.println(helper(A));
	}
	public static int helper(int n) {
		if(n==0) return 0;
		int sum = n%10 + helper(n/10);
		return sum;
	}
	
}
