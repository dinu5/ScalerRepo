package day37;

/*
Q3. Maximum Submatrix Sum

Problem Description
Given a row-wise and column-wise sorted matrix A of size N * M.
Return the maximum non-empty submatrix sum of this matrix.
 */

public class MaximumSubmatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{-5,-4,-3},
					 {-1,2,3},
					 {2,2,4}};
		System.out.println(solve(A));
	}
	public static long solve(int[][] A) {
		int n = A.length;
		int m = A[0].length;
		long[][] psum = new long[n][m];
		psum[0][0] = A[0][0];
		for(int i=1;i<m;i++) {
			psum[0][i] = psum[0][i-1] + A[0][i];
		}
		for(int i=1;i<n;i++) {
			psum[i][0] = psum[i-1][0] + A[i][0];
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				psum[i][j] = psum[i-1][j] + psum[i][j-1] - psum[i-1][j-1] + A[i][j];
			}
		}
		int i2 = n-1;
		int j2 = m-1;
		long ans = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int i1 = i;
				int j1 = j;
				long sum = psum[i2][j2];
				if(i1>0) {
					sum = sum - psum[i1-1][j2];
				}
				if(j1>0) {
					sum = sum - psum[i2][j1-1];
				}
				if(i1>0 && j1>0) {
					sum = sum + psum[i1-1][j1-1];
				}
				ans = Math.max(ans ,  sum);
			}
		}
		return ans;
	}
}
