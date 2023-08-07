package day37;

/*
Q1. Sum of all Submatrices

Problem Description
Given a 2D Matrix A of dimensions N*N, we need to return the sum of all possible submatrices.
 */

public class SumOfAllSubmatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{1, 2},{3, 4}};
		System.out.println(solve(A));
		
	}
	public static int solve(int[][] A) {
		int n = A.length;
		int m = A[0].length;
		int total = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				total += (i+1)*(j+1) * (m-j)*(n-i) * A[i][j];
			}
		}
		return total;
	}
}
