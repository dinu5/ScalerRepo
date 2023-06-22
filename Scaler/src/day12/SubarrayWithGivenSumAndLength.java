package day12;

/*
Q1. Subarray with given sum and length

Problem Description
Given an array A of length N. Also given are integers B and C.

Return 1 if there exists a subarray with length B having sum C and 0 otherwise
 */

public class SubarrayWithGivenSumAndLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 3, 2, 6, 1};
		System.out.println(solve(arr,3,11));
	}
	public static int solve(int[] A, int B, int C) {
        int sum=0;
        for(int i=0;i<B;i++){
            sum+=A[i];
        }
        if(sum==C) return 1;
        int s=1;
        int e=B;
        while(e<A.length){
            sum-=A[s-1];
            sum+=A[e];
            if(sum==C) return 1;
            s++;
            e++;
        }
        return 0;
    }
}
