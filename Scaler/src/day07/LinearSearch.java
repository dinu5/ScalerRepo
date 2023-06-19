package day07;

/*
Q2. Linear Search - Multiple Occurences

Problem Description

Given an array A and an integer B, find the number of occurrences of B in A.
 */

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 2};
		System.out.println(solve(arr,2));
	}
	public static int solve(int[] A, int B) {
        int count=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==B) count++;
        }
        return count;
    }
}
