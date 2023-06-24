package day25;

import java.util.Arrays;

/*
Q4. Count Sort

Problem Description
Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.

 */

public class CountSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 1,5,5,5};
		System.out.println(Arrays.toString(solve(arr)));
	}
	public static int[] solve(int[] A) {
        int max = 0;
        for(int i=0;i<A.length;i++){
            max = Math.max(max,A[i]);
        }
        int[] count = new int[max+1];
        for(int i=0;i<A.length;i++){
            count[A[i]] = count[A[i]]+1;
        }
        int[] ans = new int[A.length];
        int k=0;
        for(int i=1;i<count.length;i++){
            while(count[i]>0){
                ans[k++] = i;
                count[i]-=1;
            }
        }
        return ans;
    }
}
