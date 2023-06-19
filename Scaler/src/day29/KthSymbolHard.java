package day29;

/*
Q3. Kth Symbol - Hard

Problem Description
On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
 */

public class KthSymbolHard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 3;
		long B = 1;
		System.out.println(solve(A,B));

	}
	public static int solve(int A, long B) {
        if(A==0) return 0;
        long mid = (long)Math.pow(2,A-1);
        if(B<mid) return solve(A-1,B);
        else return (1 - solve(A-1,B-mid));
    }
}
