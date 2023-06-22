package day11;

import java.util.Arrays;

/*
Q4. Matrix Subtraction

Problem Description

You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M). You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).

If A and B are two matrices of the same order (same dimensions). Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.
 */

public class SubstractMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] arr2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println(Arrays.deepToString(solve(arr1,arr2))); //deepToString is to print 2D array

	}
	public static int[][] solve(int[][] A, int[][] B) {
        int[][] ans=new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                ans[i][j] = A[i][j]-B[i][j];
            }
        }
        return ans;
    }
}
