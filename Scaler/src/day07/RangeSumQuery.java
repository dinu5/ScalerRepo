package day07;

import java.util.Arrays;

/*
Q6. Range Sum Query - II

Problem Description
 You are given an integer array A of length N.
 You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
 For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
 More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 */

public class RangeSumQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		int[][] arr2D = {{0, 3},{1, 2}};
		System.out.println(Arrays.toString(solve(arr,arr2D)));
	}
	public static int[] solve(int[] A, int[][] B) {
        int[] ans=new int[B.length];
        for(int i=0;i<B.length;i++){
            int sum=0;
            for(int j=B[i][0];j<=B[i][1];j++){
                sum+=A[j];
            }
            ans[i]=sum;
        }
        return ans;
    }

}
