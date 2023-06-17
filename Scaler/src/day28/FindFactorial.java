package day28;

/*
Q2. Find Factorial!

Problem Description
Write a program to find the factorial of the given number A using recursion.

Note: The factorial of a number N is defined as the product of the numbers from 1 to N.

 */

public class FindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 5;
		System.out.println(solve(A));
	}
	public static int solve(int A) {
		if(A==1) return 1;
		return A * solve(A-1);        
    }

}
