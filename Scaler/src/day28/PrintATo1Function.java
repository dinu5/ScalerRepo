package day28;

/*
Q5. Print A to 1 function

Problem Description
You are given an integer A, print A to 1 using using recursion.

Note :- After printing all the numbers from A to 1, print a new line.


 */

public class PrintATo1Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 10;
		helper(A);
	}
	public static void helper(int n) {
		if(n==0) return;
		System.out.print(n+" ");
		helper(n-1);
	}
}
