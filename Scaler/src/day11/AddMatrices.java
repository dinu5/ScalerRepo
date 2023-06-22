package day11;

import java.util.Arrays;

/*
Q3. Add the matrices

Problem Description

You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.

The Following will give you an idea of matrix addition:
 */

public class AddMatrices {

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
                ans[i][j] = A[i][j]+B[i][j];
            }
        }
        return ans;
    }
}
