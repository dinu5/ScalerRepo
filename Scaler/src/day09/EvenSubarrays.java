package day09;

/*
Q4. Even Subarrays

Problem Description
You are given an integer array A.

Decide whether it is possible to divide the array into one or more subarrays of even length such that the first and last element of all subarrays will be even.

Return "YES" if it is possible; otherwise, return "NO" (without quotes).
 */

public class EvenSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 8, 6};
		System.out.println(solve(arr));
	}
	public static String solve(int[] A) {
        if(A.length%2!=0) return "NO";
        if(A[0]%2==0 && A[A.length-1]%2==0) return "YES";
        return "NO";
    }
}
