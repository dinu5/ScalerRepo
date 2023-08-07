package day40;

/*
Q3. Single Number

Problem Description
Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 2, 3, 1};
		System.out.println(singleNumber(A));
	}
	public static int singleNumber(final int[] A) {
        int ans = 0;
        for(int i=0;i<A.length;i++){
            ans = ans ^ A[i];
        }
        return ans;
    }
}
