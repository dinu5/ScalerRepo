package day07;

/*
Q1. Max Min of an Array

Problem Description
Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
 */

public class MinMaxOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2, 1, -4, 5, 3};
		System.out.println(solve(arr));
	}
	public static int solve(int[] A) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            max=Math.max(max,A[i]);
            min=Math.min(min,A[i]);
        }
        return min+max;
    }

}
