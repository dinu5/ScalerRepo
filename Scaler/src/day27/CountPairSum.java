package day27;

/*
 * Q1. Count Pair Sum

Problem Description
You are given an array A of N integers and an integer B. Count the number of pairs (i,j) such that A[i] + A[j] = B and i ≠ j.

Since the answer can be very large, return the remainder after dividing the count with 109+7.

Note - The pair (i,j) is same as the pair (j,i) and we need to count it only once.
 */

import java.util.HashMap;
public class CountPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 1, 2};
		int B = 8;
		System.out.println(solve(arr,B));
	}
	
	public static int solve(int[] A, int B) {
        HashMap<Integer,Integer> map=new HashMap<>();
        long count=0;
        for(int i=0;i<A.length;i++) {
        	if(map.containsKey(B-A[i])) {
        		count+=map.get(B-A[i]);
        	}
        	if(map.containsKey(A[i])) {
        		map.put(A[i], map.get(A[i])+1);
        	}else {
        		map.put(A[i], 1);
        	}
        }
        return (int)count%1000000007;
    }

}
