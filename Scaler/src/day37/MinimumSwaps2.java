package day37;

/*
Q3. Minimum Swaps 2

Problem Description
Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)].

It is allowed to swap any two elements (not necessarily consecutive).

Find the minimum number of swaps required to sort the array in ascending order.
 */

public class MinimumSwaps2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3, 4, 0};
		System.out.println(solve(A));
	}
	public static int solve(int[] A) {
		int i=0;
		int count = 0;
		while(i<A.length) {
			if(A[i]==i) i++;
			else {
				count++;
				int correctIndex = A[i];
				int temp = A[correctIndex];
				A[correctIndex] = A[i];
				A[i] = temp;
			}
		}
		return count;
	}
}
