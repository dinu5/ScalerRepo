package day20;

import java.util.Arrays;

/*
Q2. Arithmetic Progression?

Problem Description
Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
 */

public class ArithmeticProgression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 1};
		System.out.println(solve(arr));
	}
	public static int solve(int[] A) {
        Arrays.sort(A);
        int diff=A[1]-A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]-A[i-1]!=diff) return 0;
        }
        return 1;
    }
}
