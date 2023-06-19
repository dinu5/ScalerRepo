package day07;

import java.util.Arrays;

/*
Q4. Reverse the Array

Problem Description
You are given a constant array A.

You are required to return another array which is the reversed form of the input array.
 */

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,2,1};
		System.out.println(Arrays.toString(solve(arr)));
	}
	
	public static int[] solve(final int[] A) {
        int[] ans=new int[A.length];
        int k=0;
        for(int i=A.length-1;i>=0;i--){
            ans[k++]=A[i];
        }
        return ans;
    }

}
