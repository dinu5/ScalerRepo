package day12;

/*
Q1. Subarray with least average

Problem Description
Given an array of size N, find the subarray of size K with the least average.
 */

public class SubarrayWithLeastAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 7, 90, 20, 10, 50, 40};
		System.out.println(solve(arr,3));
	}
	public static int solve(int[] A, int B) {
        int sum=0;
        for(int i=0;i<B;i++){
            sum+=A[i];
        }
        int avg = sum;
        int s=1;
        int e=B;
        int ans=0;
        while(e<A.length){
            sum-=A[s-1];
            sum+=A[e];
            if(sum<avg){
                avg = sum;
                ans=s;
            }
            e++;
            s++;
        }
        return ans;
    }
}
