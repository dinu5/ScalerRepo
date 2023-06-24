package day20;

import java.util.Arrays;

/*
Q1. Sort by Color

Problem Description
Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will represent the colors as,

red -> 0
white -> 1
blue -> 2

Note: Using the library sort function is not allowed.
 */

public class SortByColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 2, 0, 1, 2};
		System.out.println(Arrays.toString(sortColors(arr)));
	}
	public static int[] sortColors(int[] A) {
        int start=0;
        int end = A.length-1;
        for(int i=0;i<A.length;i++){
            if(A[i]==0){
                swap(A,start,i);
                start++;
            }
            
        }
        for(int i=A.length-1;i>=0;i--){
            if(A[i]==2){
                swap(A,i,end);
                end--;
            }
        }
        return A;
    }
    public static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
