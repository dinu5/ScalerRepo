package day11;

import java.util.Arrays;

/*
Q5. Row to Column Zero

Problem Description
You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.
 */

public class RowToColumnZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,0},
				{9,2,0,4}
		};
		System.out.println(Arrays.deepToString(solve(arr))); //deepToString is to print 2D array
	}
	public static int[][] solve(int[][] A) {
        boolean[] row=new boolean[A.length];
        boolean[] col=new boolean[A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(row[i]==true || col[j]==true){
                    A[i][j]=0;
                }
                
            }
        }
        return A;
    }
}
