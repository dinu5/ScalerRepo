package day37;

import java.util.Arrays;

/*
Q2. Sub-matrix Sum Queries

Problem Description
Given a matrix of integers A of size N x M and multiple queries Q, for each query, find and return the submatrix sum.

Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.

NOTE:

Rows are numbered from top to bottom, and columns are numbered from left to right.
The sum may be large, so return the answer mod 109 + 7.
Also, select the data type carefully, if you want to store the addition of some elements.
Indexing given in B, C, D, and E arrays is 1-based.
Top Left 0-based index = (B[i] - 1, C[i] - 1)
Bottom Right 0-based index = (D[i] - 1, E[i] - 1)
 */

public class SubMatrixSumQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{1, 2, 3},
					 {4, 5, 6},
					 {7, 8, 9}};
		int[] B = {1, 2};
		int[] C = {1,2};
		int[] D = {2,3};
		int[] E = {2,3};
		System.out.println(Arrays.toString(solve(A,B,C,D,E)));
	}
	public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
		int MOD = 1000000007;
        int n = A.length;
		int m = A[0].length;
		long[][] psum = new long[n][m];
		psum[0][0] = A[0][0];
		for(int i=1;i<A[0].length;i++){
            psum[0][i] = (psum[0][i-1] + A[0][i])%MOD;
        }
        for(int i=1;i<A.length;i++){
            psum[i][0] = (psum[i-1][0] + A[i][0])%MOD;
        }

        for(int i=1;i<A.length;i++){
            for(int j=1;j<A[0].length;j++){
                psum[i][j] = (psum[i][j-1] + psum[i-1][j] - psum[i-1][j-1] + A[i][j])%MOD;
            }
        }
		int[] ans = new int[B.length];
		for(int i=0;i<B.length;i++){
            int i1 = B[i]-1;
            int j1 = C[i]-1;
            int i2 = D[i]-1;
            int j2 = E[i]-1;
            long sum = psum[i2][j2];
            if(i1>0){
                sum = (sum%MOD - psum[i1-1][j2]%MOD)%MOD;
            }
            if(j1>0){
                sum = (sum%MOD - psum[i2][j1-1]%MOD)%MOD;
            }
            if(i1>0 && j1>0){
                sum = (sum%MOD + psum[i1-1][j1-1]%MOD)%MOD;
            }
            if(sum<0){
                sum = (sum+MOD);
            }
            ans[i] = (int)sum%MOD;
        }
        return ans;
	}
}
