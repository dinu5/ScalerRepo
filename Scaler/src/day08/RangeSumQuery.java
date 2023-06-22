package day08;

import java.util.Arrays;

/*
Q3. Range Sum Query

Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 */

public class RangeSumQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		int[][] query = {{0, 3},{1, 2}};
		System.out.println(Arrays.toString(rangeSum(arr,query)));
	}
	public static long[] rangeSum(int[] A, int[][] B) {
        long[] pSum=new long[A.length];
        pSum[0]=A[0];
        for(int i=1;i<A.length;i++){
            pSum[i]=pSum[i-1]+A[i];
        }
        int q=0;
        long[] ans=new long[B.length];
        while(q<B.length){
            int r = B[q][1];
            int l = B[q][0];
            if(l==0){
                ans[q]=pSum[r];               
            }else{
                ans[q]=pSum[r] - pSum[l-1];
            }
            q++;
        }
        return ans;
    }
}
