package day11;

import java.util.Arrays;

/*
Q1. Matrix Scalar Product

Problem Description
You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.
 */

public class MatrixScalerProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println(Arrays.deepToString(solve(arr,2))); //deepToString is to print 2D array
	}
	public static int[][] solve(int[][] A, int B) {
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                A[i][j]*=B;
            }
        }
        return A;
    }
}
