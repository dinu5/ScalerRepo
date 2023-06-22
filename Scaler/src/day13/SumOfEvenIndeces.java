package day13;

import java.util.Arrays;

/*
Q1. Sum of even indices

Problem Description
You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of two integers B[i][0] and B[i][1].
For every query, the task is to calculate the sum of all even indices in the range A[B[i][0]…B[i][1]].

Note : Use 0-based indexing

 */

public class SumOfEvenIndeces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr2D = {
				{0,2},
				{1,4}
		};
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(solve(arr,arr2D)));
	}
	public static int[] solve(int[] A, int[][] B) {
        int[] pSumEven=new int[A.length];
        pSumEven[0]=A[0];
        for(int i=1;i<A.length;i++){
            if(i%2==0){
                pSumEven[i]=pSumEven[i-1]+A[i];
            }else{
                pSumEven[i]=pSumEven[i-1];
            }
        }
        int[] ans=new int[B.length];
        for(int i=0;i<B.length;i++){
            int l=B[i][0];
            int r=B[i][1];
            if(l==0){
                ans[i]=pSumEven[r];
            }else{
                ans[i]=pSumEven[r]-pSumEven[l-1];
            }
        }
        return ans;
    }
}
