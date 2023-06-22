package day08;

import java.util.Arrays;

/*
Q4. Product array puzzle

Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.

Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.


Input Format

The only argument given is the integer array A.
Output Format

Return the product array.
 */

public class ProductArrayPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(solve(arr)));
	}
	
	public static int[] solve(int[] A) {
        int[] right=new int[A.length];
        int[] left=new int[A.length];
        int[] ans=new int[A.length];
        left[0]=A[0];
        for(int i=1;i<A.length;i++){
            left[i]=left[i-1]*A[i];
        }
        right[A.length-1]=A[A.length-1];
        for(int i=A.length-2;i>=0;i--){
            right[i]=right[i+1]*A[i];
        }
        ans[0]=right[1];
        ans[A.length-1]=left[A.length-2];
        for(int i=1;i<A.length-1;i++){
            ans[i]=left[i-1]*right[i+1];
        }
        return ans;
    }

}
