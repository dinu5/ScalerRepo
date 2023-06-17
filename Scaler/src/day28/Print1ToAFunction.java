package day28;

/*
Q4. Print 1 to A function

Problem Description
You are given an integer A, print 1 to A using using recursion.

Note :- After printing all the numbers from 1 to A, print a new line.


 */

public class Print1ToAFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 5;
		rec(A);

	}
	public static void rec(int A) {
		if(A==0) return;
		rec(A-1);
		System.out.println(A);
	}

}
