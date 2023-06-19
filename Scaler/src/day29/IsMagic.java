package day29;

/*
Q1. Is magic?

Problem Description
Given a number A, check if it is a magic number or not.

A number is said to be a magic number if the sum of its digits 
is calculated till a single digit recursively by adding the sum of the digits 
after every addition. 
If the single digit comes out to be 1, then the number is a magic number.
 */

public class IsMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(1291));

	}
	public static int solve(int n) {
		if(n==1) return 1;
		if(n<10 && n!=1) return 0;
		int sum=0;
		while(n>0) {
			sum += n%10;
			n/=10;
		}
		return solve(sum);
	}

}
