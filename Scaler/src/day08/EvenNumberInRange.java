package day08;

import java.util.Arrays;

/*
Q6. Even numbers in a range

Problem Description
You are given an array A of length N and Q queries given by the 2D array B of size Q×2.

Each query consists of two integers B[i][0] and B[i][1].

For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].
 */

public class EvenNumberInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		int[][] query = {{0, 2},{2, 4},{1,4}};
		System.out.println(Arrays.toString(solve(arr,query)));

	}
	public static int[] solve(int[] A, int[][] B) {
        int[] pSum=new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                count++;
            }
            pSum[i]=count;
        }
        int[] ans=new int[B.length];
        int q=0;
        while(q<B.length){
            if(B[q][0]==0){
                ans[q] = pSum[B[q][1]];
            }else{
                ans[q] = pSum[B[q][1]] - pSum[B[q][0]-1];
            }
            q++; 
        }
        return ans;

    }
}
