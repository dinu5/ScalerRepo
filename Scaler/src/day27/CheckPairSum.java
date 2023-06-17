package day27;

import java.util.Set;
import java.util.HashSet;

/*
 Q2. Check Pair Sum

Problem Description
Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
 * */

public class CheckPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9, 10, 7, 10, 9, 1, 5, 1, 5};
		int target = 21;
		System.out.println(solve(arr,target));

	}
	
	public static int solve(int[] A,int target) {
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<A.length;i++) {
			if(set.contains(target-A[i])) {
				return 1;
			}
			set.add(A[i]);
		}
		return 0;
	}

}
