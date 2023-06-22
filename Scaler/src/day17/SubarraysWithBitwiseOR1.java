package day17;

/*
Q3. Subarrays with Bitwise OR 1

Problem Description
Given an array B of length A with elements 1 or 0. Find the number of subarrays such that the bitwise OR of all the elements present in the subarray is 1.
Note : The answer can be large. So, return type must be long.
 */

public class SubarraysWithBitwiseOR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,1};
		System.out.println(solve(3,arr));
	}
	public static long solve(int A, int[] B) {
        long zero=0;
        long count = 0;
        for(int i=0;i<B.length;i++){
            if(B[i]==0) zero++;
            if(B[i]==1){
                count += zero*(zero+1)/2;
                zero=0;
            }
        }
        count += zero*(zero+1)/2;
        return A*(A+1L)/2 - count;
    }
}
