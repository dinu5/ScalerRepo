package day11;

import java.util.Arrays;

/*
Q6. Matrix Transpose

Problem Description

You are given a matrix A, you have to return another matrix which is the transpose of A.

NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row.

The tranpose of a matrix switches the element at (i, j)th index to (j, i)th index, and the element at (j, i)th index to (i, j)th index.
 */

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println(Arrays.deepToString(solve(arr))); //deepToString is to print 2D array
	}
	public static int[][] solve(int[][] A) {
        int[][] ans=new int[A[0].length][A.length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                ans[j][i]=A[i][j];
            }
        }
        return ans;
    }
}
