package day10;

/*
Counting Subarrays Easy

Problem Description
Given an array A of N non-negative numbers and a non-negative number B,
you need to find the number of subarrays in A with a sum less than B.
We may assume that there is no overflow.
 */

public class CountingSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 6};
		System.out.println(solve(arr,10));
	}
	public static int solve(int[] A, int B) {
        int count=0;
        for(int i=0;i<A.length;i++){
            int sum=0;
            for(int j=i;j<A.length;j++){
                sum+=A[j];
                if(sum<B) count++;
            }
        }    
        return count;
    }
}
