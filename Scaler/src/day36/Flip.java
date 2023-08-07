package day36;

import java.util.Arrays;

/*
Q2. Flip

Problem Description
You are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN. In a single operation, you can choose two indices, L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. By flipping, we mean changing character 0 to 1 and vice-versa.

Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized.

If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.
 */

public class Flip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "010";
		System.out.println(Arrays.toString(flip(A)));
	}
	public static int[] flip(String A) {
		int[] ans = new int[2];
		int sum = 0;
		int max = 0;
		int left = 0, right = 0;
		for(int i=0;i<A.length();i++) {
			if(A.charAt(i)=='1') {
				sum -= 1;
			}
			if(A.charAt(i)=='0') {
				sum += 1;
			}
			if(sum>max) {
				max = sum;
				ans[0] = left+1;
				ans[1] = right+1;
			}
			if(sum<0) {
				sum = 0;
				left = i+1;
				right = i+1;
			}else {
				right++;
			}
		}
		if(max==0) return new int[] {};
		return ans;
	}
}
