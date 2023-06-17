package day27;

/*
Q3. Pair With Given Difference

Problem Description
Given an one-dimensional unsorted array A containing N integers.

You are also given an integer B, find if there exists a pair of elements in the array whose difference is B.

Return 1 if any such pair exists else return 0.
 */

import java.util.HashSet;

public class PairWithGivenDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 10, 3, 2, 50, 80};
		int B = 78;
		System.out.println(solve(arr,B));

	}
	public static int solve(int[] A, int B) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<A.length;i++) {
        	if(set.contains(A[i]-B) || set.contains(B+A[i])) {
        		return 1;
        	}
        	set.add(A[i]);
        }
        return 0;
    }

}
