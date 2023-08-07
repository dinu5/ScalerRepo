package day48;

import java.util.Arrays;

/*
Q1. Merge Two Sorted Arrays

Problem Description
Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.
 */

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4, 7, 9};
		int[] B = {2, 11, 19};
		System.out.println(Arrays.toString(solve(A,B)));
	}
	public static int[] solve(final int[] A, final int[] B) {
        int n = A.length, m = B.length;
        int[] ans = new int[n+m];
        int i=0,j=0;
        for(int k=0; k<(n+m); k++) {
            if(i==n) ans[k] = B[j++];
            else if(j==m) ans[k] = A[i++];
            else if(A[i]<=B[j]) ans[k] = A[i++];
            else ans[k] = B[j++];
        }
        return ans;
    }
}
