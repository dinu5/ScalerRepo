package day40;

/*
Q1. Strange Equality

Problem Description
Given an integer A.
Two numbers, X and Y, are defined as follows:

X is the greatest number smaller than A such that the XOR sum of X and A is the same as the sum of X and A.
Y is the smallest number greater than A, such that the XOR sum of Y and A is the same as the sum of Y and A.
Find and return the XOR of X and Y.

NOTE 1: XOR of X and Y is defined as X ^ Y where '^' is the BITWISE XOR operator.

NOTE 2: Your code will be run against a maximum of 100000 Test Cases.
 */

public class StrangeEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 5;
		System.out.println(solve(A));
	}
	public static int solve(int A) {
		int X = 0;
		int Y = 0;
		int k = 0;
		while(A>0) {
			if((A&1)==0) {
				X = X|(1<<k);
			}
			k++;
			A>>=1;
		}
		Y = Y | (1<<k);
		return X^Y;
	}
}
