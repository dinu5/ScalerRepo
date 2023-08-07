package day40;

/*
Q4. Single Number II

Problem Description
Given an array of integers, every element appears thrice except for one, which occurs once.

Find that element that does not appear thrice.

NOTE: Your algorithm should have a linear runtime complexity.

Could you implement it without using extra memory?
 */

public class SingleNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
		System.out.println(singleNumber(A));

	}
	public static int singleNumber(final int[] A) {
		int ans = 0;
		for(int i=0;i<32;i++) {
			int one = 0;
			for(int j=0;j<A.length;j++) {
				if((A[j]&(1<<i))==(1<<i)) one++;
			}
			if(one%3!=0) ans = ans | (1<<i);
		}
		return ans;
	}
}
