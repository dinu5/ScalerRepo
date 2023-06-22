package day09;

import java.util.Arrays;

/*
Q2. Leaders in an array

Problem Description
Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.

NOTE: The rightmost element is always a leader.
 */

public class FindLeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {16, 17, 4, 3, 5, 2};
		System.out.println(Arrays.toString(solve(arr)));
	}
	public static int[] solve(int[] A) {
        int max=A[A.length-1];
        int[] ans=new int[A.length];
        ans[0]=max;
        int k=1;
        for(int i=A.length-2;i>=0;i--){
            if(A[i]>max){
                max=A[i];
                ans[k++]=max;
            }
        }
        return Arrays.copyOfRange(ans,0,k);
    }
}
