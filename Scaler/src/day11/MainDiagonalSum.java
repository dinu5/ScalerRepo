package day11;

/*
Q3. Main Diagonal Sum

Problem Description
You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.

Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
 */

public class MainDiagonalSum {

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
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(i==j){
                    sum+=A[i][j];
                }
            }
           
        }
        return sum;
    }
}
