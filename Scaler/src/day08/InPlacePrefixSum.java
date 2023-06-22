package day08;

import java.util.Arrays;

/*
Q4. In-place Prefix Sum

Problem Description
Given an array A of N integers. Construct prefix sum of the array in the given array itself.
 */

public class InPlacePrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(solve(arr)));
	}
	 public static int[] solve(int[] A) {
	        for(int i=1;i<A.length;i++){
	            A[i]=A[i-1]+A[i];
	        }
	        return A;
	    }
}
