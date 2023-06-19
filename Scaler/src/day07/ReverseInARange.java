package day07;

import java.util.Arrays;

/*
Q3. Reverse in a range

Problem Description
Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].
 */

public class ReverseInARange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		System.out.println(Arrays.toString(solve(arr,2,3)));
	}
	
	public static int[] solve(int[] A, int B, int C) {
        while(B<C){
            int temp=A[B];
            A[B]=A[C];
            A[C]=temp;
            B++;
            C--;
        }
        return A;
    }
}
