package day12;

import java.util.Arrays;

/*
Q3. Spiral Order Matrix II

Problem Description
Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.
 */

public class SpiralMetrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 5;
		System.out.println(Arrays.deepToString(generateMatrix(A))); //deepToString is to print 2D array
	}
	public static int[][] generateMatrix(int A) {
        int[][] ans=new int[A][A];
        int maxRow = A-1;
        int minRow=0;
        int maxCol = A-1;
        int minCol = 0;
        int val = 1;
        while(minRow<=maxRow && minCol<=maxCol){
            for(int i=minCol;i<=maxCol;i++){
                ans[minRow][i] = val;
                val++;
            }
            minRow++;
            for(int i=minRow;i<=maxRow;i++){
                ans[i][maxCol] = val;
                val++;
            }
            maxCol--;
            for(int i=maxCol;i>=minCol;i--){
                ans[maxRow][i] = val;
                val++;
            }
            maxRow--;
            for(int i=maxRow;i>=minRow;i--){
                ans[i][minCol] = val;
                val++;
            }
            minCol++;
        }
        return ans;
    }
}
