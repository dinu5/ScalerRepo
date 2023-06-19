package day07;

import java.util.Arrays;

/*
Q5. Array Rotation

Problem Description
Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
 */

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		System.out.println(Arrays.toString(solve(arr,2)));
	}
	public static int[] solve(int[] A, int B) {
        B=B%A.length;
        reverse(A,0,A.length-1);
        reverse(A,0,B-1);
        reverse(A,B,A.length-1);
        return A;
    }
    public static void reverse(int[] A,int B,int C){
        while(B<C){
            int temp=A[B];
            A[B]=A[C];
            A[C]=temp;
            B++;
            C--;
        }
        
    }
	
}
