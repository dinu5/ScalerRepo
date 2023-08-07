package day38;

import java.util.Arrays;

/*
Q1. Next Permutation

Problem Description
Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers for a given array A of size N.

If such arrangement is not possible, it must be rearranged as the lowest possible order, i.e., sorted in ascending order.

NOTE:

The replacement must be in-place, do not allocate extra memory.
DO NOT USE LIBRARY FUNCTION FOR NEXT PERMUTATION. Use of Library functions will disqualify your submission retroactively and will give you penalty points.
 */

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3};
		System.out.println(Arrays.toString(nextPermutation(A)));
	}
	public static int[] nextPermutation(int[] A) {
		int n = A.length;
        if(n==1) return A;
		int i = n-2;
		while(i>=0 && A[i]>A[i+1]) i--;
        if(i==-1){
            reverse(A,0,n-1);
            return A;
        }
		int tobeSwapped = n-1;
		while(A[tobeSwapped]<=A[i]) tobeSwapped--;
		swap(A,i,tobeSwapped);
		reverse(A,i+1,n-1);
		return A;
	}
	public static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void reverse(int[] arr,int s,int e) {
		while(s<e) {
			swap(arr,s,e);
			s++;
			e--;
		}
	}
}
