package day36;

import java.util.Arrays;

/*
Q1. Add One To Number

Problem Description
Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :

Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
A: For the purpose of this question, YES
Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
 */

public class AddOneToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3};
		System.out.println(Arrays.toString(plusOne(A)));
	}
	public static int[] plusOne(int[] A) {
		int i = A.length-1;
		while(i>=0) {
			if(A[i]<9) {
				A[i] = A[i]+1;
                int start = 0;
                while(A[start]==0) start++;
				return Arrays.copyOfRange(A,start,A.length);
			}else{
                A[i] = 0;
            }
			i--;
		}
		
		int[] ans = new int[A.length+1];
		ans[0] = 1;
		return ans;	
	}
}
