package day11;

/*
Q4. Minor Diagonal Sum

Problem Description
You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.

Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).
 */

public class MinorDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1, -2, -3},
				{-4, 5, -6},
				{-7, -8, 9}
		};
		System.out.println(solve(arr));
	}
	public static int solve(final int[][] A) {
        int sum=0;
        int i=A.length-1;
        int j=0;
        while(i>=0 && j<A.length){
            sum += A[i][j];
            i--;;
            j++;
        }
        
        return sum;
    }
}
