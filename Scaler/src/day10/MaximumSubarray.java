package day10;

/*
Q5. Maximum Subarray Easy

Problem Description
You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
But the sum must not exceed B.
 */

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 5;
		int B = 12;
		int[] arr = {2, 1, 3, 4, 5};
		System.out.println(maxSubarray(A,B,arr));
	}
	public static int maxSubarray(int A, int B, int[] C) {
        int maxSum=0;
        for(int i=0;i<A;i++){
            int sum=0;
            for(int j=i;j<A;j++){
                sum+=C[j];
                if(sum<=B){
                    maxSum=Math.max(maxSum,sum);
                }
            }
            
        }
        return maxSum;
    }
}
