package day11;

import java.util.Arrays;

/*
Q7. Rotate Matrix

Problem Description
You are given a n x n 2D matrix A representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note: If you end up using an additional array, you will only receive partial score.
 */

public class RotateMatrix {

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
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                int t=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=t;
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length/2;j++){
                int t=A[i][A.length-1-j];
                A[i][A.length-1-j]=A[i][j];
                A[i][j]=t;
            }
        }
        return A;
    }
}
