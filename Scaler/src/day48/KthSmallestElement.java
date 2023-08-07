package day48;

/*
Q2. Kth Smallest Element

Problem Description
Find the Bth smallest element in given array A .

NOTE: Users should try to solve it in less than equal to B swaps.
 */

public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2, 1, 4, 3, 2};
		int B = 3;
		System.out.println(helper(A,B));
	}

	public static int helper(int[] A, int k) {
		for (int i = 0; i < k; i++) {
			int minValue = A[i];
			int minIndex = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] < minValue) {
					minValue = A[j];
					minIndex = j;
				}
			}
			int temp = A[i];
			A[i] = A[minIndex];
			A[minIndex] = temp;
		}
		return A[k - 1];
	}
}
