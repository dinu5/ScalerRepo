package day11;

import java.util.Arrays;

/*
Q1. Column Sum

Problem Description
You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
 */

public class ColumnSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,2,3,4}
		};
		System.out.println(Arrays.toString(solve(arr)));
	}
	public static int[] solve(int[][] A) {
        int[] ans=new int[A[0].length];
        for(int i=0;i<A[0].length;i++){
            int sum=0;
            for(int j=0;j<A.length;j++){
                sum+=A[j][i];
            }
            ans[i]=sum;
        }
        return ans;
    }
}
