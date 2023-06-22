package day11;

import java.util.Arrays;

/*
Q5. Anti Diagonals

Problem Description
Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.
 */

public class AntiDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println(Arrays.deepToString(diagonal(arr))); //deepToString is to print 2D array
	}
	public static int[][] diagonal(int[][] A) {
        int[][] ans=new int[2*A.length-1][A.length];
        int k=0;
        for(int i=0;i<A.length-1;i++){
            int row=0;
            int col=i;
            while(col>=0){
                ans[k][row] = A[row][col];
                col--;
                row++;
                
            }
            k++;
        }
        
        for(int i=0;i<A.length;i++){
            int row = i;
            int col = A.length-1;
            while(row<A.length){
                ans[k][row-i] = A[row][col];
                row++;
                col--;
                
            }
            k++;
        }
        return ans;
    }
}
