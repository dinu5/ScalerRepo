package day20;

import java.util.Arrays;

/*
Q1. Elements Removal

Problem Description
Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.

Find the minimum cost to remove all elements from the array.
 */

public class ElementsRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 1};
		System.out.println(solve(arr));
	}
	public static int solve(int[] A) {
        Arrays.sort(A);
        int k=1;
        int ans=0;
        for(int i=A.length-1;i>=0;i--){
            ans += k * A[i];
            k++;
        }
        return ans;
    }
}
