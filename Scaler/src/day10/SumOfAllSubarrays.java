package day10;

/*
Q6. Sum of All Subarrays

Problem Description
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
 */

public class SumOfAllSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3};
		System.out.println(subarraySum(arr));
	}
	public static long subarraySum(int[] A) {
        long ans=0;
        long n = A.length;
        for(int i=0;i<A.length;i++){
            ans += (i+1) * (n-i) * A[i];
        }
        return ans;
    }
}
