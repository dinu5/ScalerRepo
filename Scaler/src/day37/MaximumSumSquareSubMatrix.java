package day37;

/*
Q1. Maximum Sum Square SubMatrix

Problem Description
Given a 2D integer matrix A of size N x N, find a B x B submatrix where B<= N and B>= 1, such that the sum of all the elements in the submatrix is maximum.


 */

public class MaximumSumSquareSubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{1, 1, 1, 1, 1},
				{2, 2, 2, 2, 2},
				{3, 8, 6, 7, 3},
				{4, 4, 4, 4, 4},
				{5, 5, 5, 5, 5}};
		int B = 3;
		System.out.println(solve(A,B));
	}

	public static int solve(int[][] A, int B) {

		int n = A.length;
		int m = A[0].length;
		int[][] rowSum = new int[n - B + 1][m];
		for (int col = 0; col < m; col++) {
			int sum = 0;
			for (int row = 0; row < B; row++) {
				sum += A[row][col];
			}
			rowSum[0][col] = sum;
			int s = 1;
			int e = B;
			while (e < n) {
				sum = sum - A[s - 1][col] + A[e][col];
				rowSum[s][col] = sum;
				s++;
				e++;
			}
		}
		// for(int[] arr : rowSum)
		// System.out.println(Arrays.toString(arr));
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < rowSum.length; i++) {
			int sum = 0;
			for (int j = 0; j < B; j++) {
				sum += rowSum[i][j];
			}
			maxSum = Math.max(maxSum, sum);
			int s = 1;
			int e = B;
			while (e < m) {
				sum = sum + rowSum[i][e] - rowSum[i][s - 1];

				s++;
				e++;
				maxSum = Math.max(maxSum, sum);
			}
		}
		return maxSum;
	}
}
