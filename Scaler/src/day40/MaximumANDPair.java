package day40;

/*
Q2. Maximum AND Pair

Problem Description
Given an array A. For every pair of indices i and j (i != j), find the maximum A[i] & A[j].

 */

public class MaximumANDPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {53, 39, 88};
		System.out.println(solve(A));
	}
	public static int solve(int[] A) {
		int ans = 0;
		for(int i=31;i>=0;i--) {
			int one = 0;
			for(int j=0;j<A.length;j++) {
				if((A[j]&(1<<i))==(1<<i)) one++;
			}
			if(one>=2) {
				ans = ans | (1<<i);
				for(int j=0;j<A.length;j++) {
					if((A[j]&(1<<i))!=(1<<i)) {
						A[j] = 0;
					}
				}
			}
		}
		return ans;
	}
}
