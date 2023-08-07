package day40;

/*
Q4. Sum of Xor of all Pairs

Problem Description
Given an array A of N integers. Find the sum of bitwise XOR all pairs of numbers in the array.

Since the answer can be large, return the remainder after the dividing the answer by 109+7.
 */

public class SumOfXOROfAllPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3};
		System.out.println(solve(A));
	}
	public static int solve(int[] A) {
		 long total = 0;
		 int MOD = 1000000007;
        long n = A.length;
		 for(int i=0;i<32;i++) {
			 long one = 0;
			 long zero = 0;
			 for(int j=0;j<n;j++) {
				 if((A[j]&(1<<i))==(1<<i)) one++;
				 else zero++;
			 }
            long pair = one*zero;
            long pow = (pair * (1<<i))%MOD;
			 total = (total + pow)%MOD;
		 }
		 return (int)total%MOD;
	 }
}
