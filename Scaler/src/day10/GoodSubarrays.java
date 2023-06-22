package day10;

/*
Q1. Good Subarrays Easy

Problem Description
Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.

 */

public class GoodSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(solve(arr,4));
	}
	public static int solve(int[] A, int B) {
        int count=0;
        for(int i=0;i<A.length;i++){
            int sum=0;
            for(int j=i;j<A.length;j++){
                sum+=A[j];
                if((j-i+1)%2==0 && sum<B){
                    count++;
                }
                if((j-i+1)%2!=0 && sum>B){
                    count++;
                }
            }
        }
        return count;
    }
}
