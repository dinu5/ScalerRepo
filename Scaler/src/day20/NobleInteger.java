package day20;

import java.util.Arrays;

/*
Q2. Noble Integer

Problem Description
Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
 */

public class NobleInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 2, 1, 3};
		System.out.println(solve(arr));
	}
	public static int solve(int[] A) {
        Arrays.sort(A);
        int count=0;
        if(A[A.length-1]==count) return 1;
        for(int i=A.length-2;i>=0;i--){
            if(A[i]!=A[i+1]) count = A.length-1-i;
            if(A[i]==count) return 1;
        }
        return -1;
    }
}
