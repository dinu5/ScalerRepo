package day07;

import java.util.Arrays;

/*
Q1. Count of elements

Problem Description
Given an array A of N integers. 
Count the number of elements that have at least 1 elements greater than itself.
 */

public class CountOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 1, 2};
		System.out.println(solve(arr));
	}
	
	public static int solve(int[] A) {
        Arrays.sort(A);
        int max = A[A.length-1];
        int count=0;
        for(int i=0;i<A.length;i++){
            if(A[i]<max) count++;
        }
        return count;
    }

}
