package day36;

/*
Q1. Max Sum Contiguous Subarray

Problem Description
Find the maximum sum of contiguous non-empty subarray within an array A of length N.
 */

public class MaxSumContiguousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, -10};
		System.out.println(maxSubArray(arr));
	}
	public static int maxSubArray(int[] A) {
		int maxSum = 0;
		int sum = 0;
		for(int i=0;i<A.length;i++) {
			sum += A[i];
			if(sum>maxSum) {
				maxSum = sum;
			}
			if(sum<0) {
				sum = 0;
			}
		}
		return maxSum;
	}
}
